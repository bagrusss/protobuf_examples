#!/usr/bin/env bash

PROTO_FILES=`find ./proto/ -name \*.proto -print`
PROTOBUF="./proto"
PROTOMODEL='./src/main/java'

rm -rf PROTOMODEL
protoc --proto_path=${PROTOBUF}/ --java_out=${PROTOMODEL} ${PROTO_FILES}
