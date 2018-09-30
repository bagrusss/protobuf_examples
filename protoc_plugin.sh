#!/usr/bin/env bash

REALM_PATH="src/main/java/ru.bagrusss.example/realm"
FILES=`find ../path/to/proto -name \*.proto -print`

protoc --plugin=protoc-gen-run=run.sh --proto_path=/path/to/proto --run_out=${REALM_PATH} ${FILES}

PROTOMODEL="./src/main/java"
PROTOBUF="/path/to/proto"
PROTO_FILES=`find ${PROTOBUF} -name \*.proto -print`

protoc --proto_path=${PROTOBUF} --java_out=${PROTOMODEL} ${PROTO_FILES}