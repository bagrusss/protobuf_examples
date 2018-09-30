package ru.bagrusss.demo

import com.google.protobuf.DescriptorProtos
import com.google.protobuf.ExtensionRegistryLite
import com.google.protobuf.compiler.PluginProtos
import ru.bagrusss.demo.proto.JavaOptions
import java.io.InputStream
import java.io.PrintStream


fun generatorExample(input: InputStream, output: PrintStream) {
    val registry = ExtensionRegistryLite.newInstance()
    JavaOptions.registerAllExtensions(registry)

    val response = PluginProtos.CodeGeneratorResponse.newBuilder()
    val request =  PluginProtos.CodeGeneratorRequest.parseFrom(input, registry)

    request.protoFileList.forEach { protoFile ->
        val (protoFilePackage, protoFileJavaPackage) = protoFile.`package` to protoFile.options.javaPackage

        protoFile.messageTypeList.forEach {
            handleProtoMessage(it)
        }
    }

    response.build()
            .writeTo(output)
}

fun handleProtoMessage(node: DescriptorProtos.DescriptorProto) {
    // Other nested types
    node.nestedTypeList.forEach {
        handleProtoMessage(it)
    }

    val isMap = node.options.mapEntry //check if this field map<key, value>

    // fieldList for current message
    node.fieldList.forEach {

    }
}