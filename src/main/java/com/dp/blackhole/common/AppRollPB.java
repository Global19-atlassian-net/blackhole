// Generated by the protocol buffer compiler.    DO NOT EDIT!
// source: AppRoll.proto

package com.dp.blackhole.common;

public final class AppRollPB {
    private AppRollPB() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface AppRollOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required string app_name = 1;
        /**
         * <code>required string app_name = 1;</code>
         */
        boolean hasAppName();
        /**
         * <code>required string app_name = 1;</code>
         */
        java.lang.String getAppName();
        /**
         * <code>required string app_name = 1;</code>
         */
        com.google.protobuf.ByteString
                getAppNameBytes();

        // required string app_server = 2;
        /**
         * <code>required string app_server = 2;</code>
         */
        boolean hasAppServer();
        /**
         * <code>required string app_server = 2;</code>
         */
        java.lang.String getAppServer();
        /**
         * <code>required string app_server = 2;</code>
         */
        com.google.protobuf.ByteString
                getAppServerBytes();

        // required string roll_ident = 3;
        /**
         * <code>required string roll_ident = 3;</code>
         */
        boolean hasRollIdent();
        /**
         * <code>required string roll_ident = 3;</code>
         */
        java.lang.String getRollIdent();
        /**
         * <code>required string roll_ident = 3;</code>
         */
        com.google.protobuf.ByteString
                getRollIdentBytes();

        // required int64 length = 4;
        /**
         * <code>required int64 length = 4;</code>
         */
        boolean hasLength();
        /**
         * <code>required int64 length = 4;</code>
         */
        long getLength();
    }
    /**
     * Protobuf type {@code blackhole.AppRoll}
     */
    public static final class AppRoll extends
            com.google.protobuf.GeneratedMessage
            implements AppRollOrBuilder {
        // Use AppRoll.newBuilder() to construct.
        private AppRoll(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private AppRoll(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final AppRoll defaultInstance;
        public static AppRoll getDefaultInstance() {
            return defaultInstance;
        }

        public AppRoll getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
                getUnknownFields() {
            return this.unknownFields;
        }
        private AppRoll(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                                                         extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            appName_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            appServer_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            rollIdent_ = input.readBytes();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            length_ = input.readInt64();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
            return com.dp.blackhole.common.AppRollPB.internal_static_blackhole_AppRoll_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return com.dp.blackhole.common.AppRollPB.internal_static_blackhole_AppRoll_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.dp.blackhole.common.AppRollPB.AppRoll.class, com.dp.blackhole.common.AppRollPB.AppRoll.Builder.class);
        }

        public static com.google.protobuf.Parser<AppRoll> PARSER =
                new com.google.protobuf.AbstractParser<AppRoll>() {
            public AppRoll parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new AppRoll(input, extensionRegistry);
            }
        };

        @java.lang.Override
        public com.google.protobuf.Parser<AppRoll> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required string app_name = 1;
        public static final int APP_NAME_FIELD_NUMBER = 1;
        private java.lang.Object appName_;
        /**
         * <code>required string app_name = 1;</code>
         */
        public boolean hasAppName() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string app_name = 1;</code>
         */
        public java.lang.String getAppName() {
            java.lang.Object ref = appName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs = 
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    appName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string app_name = 1;</code>
         */
        public com.google.protobuf.ByteString
                getAppNameBytes() {
            java.lang.Object ref = appName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                appName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string app_server = 2;
        public static final int APP_SERVER_FIELD_NUMBER = 2;
        private java.lang.Object appServer_;
        /**
         * <code>required string app_server = 2;</code>
         */
        public boolean hasAppServer() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required string app_server = 2;</code>
         */
        public java.lang.String getAppServer() {
            java.lang.Object ref = appServer_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs = 
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    appServer_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string app_server = 2;</code>
         */
        public com.google.protobuf.ByteString
                getAppServerBytes() {
            java.lang.Object ref = appServer_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                appServer_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required string roll_ident = 3;
        public static final int ROLL_IDENT_FIELD_NUMBER = 3;
        private java.lang.Object rollIdent_;
        /**
         * <code>required string roll_ident = 3;</code>
         */
        public boolean hasRollIdent() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required string roll_ident = 3;</code>
         */
        public java.lang.String getRollIdent() {
            java.lang.Object ref = rollIdent_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs = 
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    rollIdent_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string roll_ident = 3;</code>
         */
        public com.google.protobuf.ByteString
                getRollIdentBytes() {
            java.lang.Object ref = rollIdent_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b = 
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                rollIdent_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required int64 length = 4;
        public static final int LENGTH_FIELD_NUMBER = 4;
        private long length_;
        /**
         * <code>required int64 length = 4;</code>
         */
        public boolean hasLength() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>required int64 length = 4;</code>
         */
        public long getLength() {
            return length_;
        }

        private void initFields() {
            appName_ = "";
            appServer_ = "";
            rollIdent_ = "";
            length_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasAppName()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAppServer()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasRollIdent()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasLength()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                                                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getAppNameBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getAppServerBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getRollIdentBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt64(4, length_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(1, getAppNameBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(2, getAppServerBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(3, getRollIdentBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(4, length_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.dp.blackhole.common.AppRollPB.AppRoll parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(com.dp.blackhole.common.AppRollPB.AppRoll prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code blackhole.AppRoll}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
             implements com.dp.blackhole.common.AppRollPB.AppRollOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
                    getDescriptor() {
                return com.dp.blackhole.common.AppRollPB.internal_static_blackhole_AppRoll_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return com.dp.blackhole.common.AppRollPB.internal_static_blackhole_AppRoll_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.dp.blackhole.common.AppRollPB.AppRoll.class, com.dp.blackhole.common.AppRollPB.AppRoll.Builder.class);
            }

            // Construct using com.dp.blackhole.common.AppRollPB.AppRoll.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                appName_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                appServer_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                rollIdent_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                length_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
                    getDescriptorForType() {
                return com.dp.blackhole.common.AppRollPB.internal_static_blackhole_AppRoll_descriptor;
            }

            public com.dp.blackhole.common.AppRollPB.AppRoll getDefaultInstanceForType() {
                return com.dp.blackhole.common.AppRollPB.AppRoll.getDefaultInstance();
            }

            public com.dp.blackhole.common.AppRollPB.AppRoll build() {
                com.dp.blackhole.common.AppRollPB.AppRoll result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.dp.blackhole.common.AppRollPB.AppRoll buildPartial() {
                com.dp.blackhole.common.AppRollPB.AppRoll result = new com.dp.blackhole.common.AppRollPB.AppRoll(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.appName_ = appName_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.appServer_ = appServer_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.rollIdent_ = rollIdent_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.length_ = length_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.dp.blackhole.common.AppRollPB.AppRoll) {
                    return mergeFrom((com.dp.blackhole.common.AppRollPB.AppRoll)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.dp.blackhole.common.AppRollPB.AppRoll other) {
                if (other == com.dp.blackhole.common.AppRollPB.AppRoll.getDefaultInstance()) return this;
                if (other.hasAppName()) {
                    bitField0_ |= 0x00000001;
                    appName_ = other.appName_;
                    onChanged();
                }
                if (other.hasAppServer()) {
                    bitField0_ |= 0x00000002;
                    appServer_ = other.appServer_;
                    onChanged();
                }
                if (other.hasRollIdent()) {
                    bitField0_ |= 0x00000004;
                    rollIdent_ = other.rollIdent_;
                    onChanged();
                }
                if (other.hasLength()) {
                    setLength(other.getLength());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAppName()) {
                    
                    return false;
                }
                if (!hasAppServer()) {
                    
                    return false;
                }
                if (!hasRollIdent()) {
                    
                    return false;
                }
                if (!hasLength()) {
                    
                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.dp.blackhole.common.AppRollPB.AppRoll parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.dp.blackhole.common.AppRollPB.AppRoll) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required string app_name = 1;
            private java.lang.Object appName_ = "";
            /**
             * <code>required string app_name = 1;</code>
             */
            public boolean hasAppName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string app_name = 1;</code>
             */
            public java.lang.String getAppName() {
                java.lang.Object ref = appName_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    appName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string app_name = 1;</code>
             */
            public com.google.protobuf.ByteString
                    getAppNameBytes() {
                java.lang.Object ref = appName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = 
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    appName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string app_name = 1;</code>
             */
            public Builder setAppName(
                    java.lang.String value) {
                if (value == null) {
        throw new NullPointerException();
    }
    bitField0_ |= 0x00000001;
                appName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string app_name = 1;</code>
             */
            public Builder clearAppName() {
                bitField0_ = (bitField0_ & ~0x00000001);
                appName_ = getDefaultInstance().getAppName();
                onChanged();
                return this;
            }
            /**
             * <code>required string app_name = 1;</code>
             */
            public Builder setAppNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
        throw new NullPointerException();
    }
    bitField0_ |= 0x00000001;
                appName_ = value;
                onChanged();
                return this;
            }

            // required string app_server = 2;
            private java.lang.Object appServer_ = "";
            /**
             * <code>required string app_server = 2;</code>
             */
            public boolean hasAppServer() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required string app_server = 2;</code>
             */
            public java.lang.String getAppServer() {
                java.lang.Object ref = appServer_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    appServer_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string app_server = 2;</code>
             */
            public com.google.protobuf.ByteString
                    getAppServerBytes() {
                java.lang.Object ref = appServer_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = 
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    appServer_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string app_server = 2;</code>
             */
            public Builder setAppServer(
                    java.lang.String value) {
                if (value == null) {
        throw new NullPointerException();
    }
    bitField0_ |= 0x00000002;
                appServer_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string app_server = 2;</code>
             */
            public Builder clearAppServer() {
                bitField0_ = (bitField0_ & ~0x00000002);
                appServer_ = getDefaultInstance().getAppServer();
                onChanged();
                return this;
            }
            /**
             * <code>required string app_server = 2;</code>
             */
            public Builder setAppServerBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
        throw new NullPointerException();
    }
    bitField0_ |= 0x00000002;
                appServer_ = value;
                onChanged();
                return this;
            }

            // required string roll_ident = 3;
            private java.lang.Object rollIdent_ = "";
            /**
             * <code>required string roll_ident = 3;</code>
             */
            public boolean hasRollIdent() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required string roll_ident = 3;</code>
             */
            public java.lang.String getRollIdent() {
                java.lang.Object ref = rollIdent_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    rollIdent_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string roll_ident = 3;</code>
             */
            public com.google.protobuf.ByteString
                    getRollIdentBytes() {
                java.lang.Object ref = rollIdent_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = 
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    rollIdent_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string roll_ident = 3;</code>
             */
            public Builder setRollIdent(
                    java.lang.String value) {
                if (value == null) {
        throw new NullPointerException();
    }
    bitField0_ |= 0x00000004;
                rollIdent_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string roll_ident = 3;</code>
             */
            public Builder clearRollIdent() {
                bitField0_ = (bitField0_ & ~0x00000004);
                rollIdent_ = getDefaultInstance().getRollIdent();
                onChanged();
                return this;
            }
            /**
             * <code>required string roll_ident = 3;</code>
             */
            public Builder setRollIdentBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
        throw new NullPointerException();
    }
    bitField0_ |= 0x00000004;
                rollIdent_ = value;
                onChanged();
                return this;
            }

            // required int64 length = 4;
            private long length_ ;
            /**
             * <code>required int64 length = 4;</code>
             */
            public boolean hasLength() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>required int64 length = 4;</code>
             */
            public long getLength() {
                return length_;
            }
            /**
             * <code>required int64 length = 4;</code>
             */
            public Builder setLength(long value) {
                bitField0_ |= 0x00000008;
                length_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int64 length = 4;</code>
             */
            public Builder clearLength() {
                bitField0_ = (bitField0_ & ~0x00000008);
                length_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:blackhole.AppRoll)
        }

        static {
            defaultInstance = new AppRoll(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:blackhole.AppRoll)
    }

    private static com.google.protobuf.Descriptors.Descriptor
        internal_static_blackhole_AppRoll_descriptor;
    private static
        com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_blackhole_AppRoll_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
            getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
            "\n\rAppRoll.proto\022\tblackhole\"S\n\007AppRoll\022\020\n" +
            "\010app_name\030\001 \002(\t\022\022\n\napp_server\030\002 \002(\t\022\022\n\nr" +
            "oll_ident\030\003 \002(\t\022\016\n\006length\030\004 \002(\003B$\n\027com.d" +
            "p.blackhole.commonB\tAppRollPB"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
            new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                public com.google.protobuf.ExtensionRegistry assignDescriptors(
                        com.google.protobuf.Descriptors.FileDescriptor root) {
                    descriptor = root;
                    internal_static_blackhole_AppRoll_descriptor =
                        getDescriptor().getMessageTypes().get(0);
                    internal_static_blackhole_AppRoll_fieldAccessorTable = new
                        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                            internal_static_blackhole_AppRoll_descriptor,
                            new java.lang.String[] { "AppName", "AppServer", "RollIdent", "Length", });
                    return null;
                }
            };
        com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[] {
                }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
