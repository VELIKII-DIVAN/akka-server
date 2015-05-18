// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packet.proto

package ru.solverit.net.packet;

public final class Packet {
  private Packet() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PacketMSGOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 time = 1;
    boolean hasTime();
    long getTime();
    
    // required int64 idsess = 2;
    boolean hasIdsess();
    long getIdsess();
    
    // required bool ping = 3;
    boolean hasPing();
    boolean getPing();
    
    // optional int32 cmd = 4;
    boolean hasCmd();
    int getCmd();
    
    // optional bytes data = 5;
    boolean hasData();
    com.google.protobuf.ByteString getData();
  }
  public static final class PacketMSG extends
      com.google.protobuf.GeneratedMessage
      implements PacketMSGOrBuilder {
    // Use PacketMSG.newBuilder() to construct.
    private PacketMSG(Builder builder) {
      super(builder);
    }
    private PacketMSG(boolean noInit) {}
    
    private static final PacketMSG defaultInstance;
    public static PacketMSG getDefaultInstance() {
      return defaultInstance;
    }
    
    public PacketMSG getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.solverit.net.packet.Packet.internal_static_ru_solverit_net_packet_PacketMSG_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.solverit.net.packet.Packet.internal_static_ru_solverit_net_packet_PacketMSG_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 time = 1;
    public static final int TIME_FIELD_NUMBER = 1;
    private long time_;
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTime() {
      return time_;
    }
    
    // required int64 idsess = 2;
    public static final int IDSESS_FIELD_NUMBER = 2;
    private long idsess_;
    public boolean hasIdsess() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getIdsess() {
      return idsess_;
    }
    
    // required bool ping = 3;
    public static final int PING_FIELD_NUMBER = 3;
    private boolean ping_;
    public boolean hasPing() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getPing() {
      return ping_;
    }
    
    // optional int32 cmd = 4;
    public static final int CMD_FIELD_NUMBER = 4;
    private int cmd_;
    public boolean hasCmd() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getCmd() {
      return cmd_;
    }
    
    // optional bytes data = 5;
    public static final int DATA_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString data_;
    public boolean hasData() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    
    private void initFields() {
      time_ = 0L;
      idsess_ = 0L;
      ping_ = false;
      cmd_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIdsess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPing()) {
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
        output.writeInt64(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, idsess_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, ping_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, cmd_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, data_);
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
          .computeInt64Size(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, idsess_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, ping_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, cmd_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, data_);
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
    
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static ru.solverit.net.packet.Packet.PacketMSG parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ru.solverit.net.packet.Packet.PacketMSG prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements ru.solverit.net.packet.Packet.PacketMSGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ru.solverit.net.packet.Packet.internal_static_ru_solverit_net_packet_PacketMSG_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ru.solverit.net.packet.Packet.internal_static_ru_solverit_net_packet_PacketMSG_fieldAccessorTable;
      }
      
      // Construct using ru.solverit.net.packet.Packet.PacketMSG.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
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
        time_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        idsess_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        ping_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        cmd_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ru.solverit.net.packet.Packet.PacketMSG.getDescriptor();
      }
      
      public ru.solverit.net.packet.Packet.PacketMSG getDefaultInstanceForType() {
        return ru.solverit.net.packet.Packet.PacketMSG.getDefaultInstance();
      }
      
      public ru.solverit.net.packet.Packet.PacketMSG build() {
        ru.solverit.net.packet.Packet.PacketMSG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private ru.solverit.net.packet.Packet.PacketMSG buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        ru.solverit.net.packet.Packet.PacketMSG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public ru.solverit.net.packet.Packet.PacketMSG buildPartial() {
        ru.solverit.net.packet.Packet.PacketMSG result = new ru.solverit.net.packet.Packet.PacketMSG(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.time_ = time_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.idsess_ = idsess_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ping_ = ping_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.cmd_ = cmd_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ru.solverit.net.packet.Packet.PacketMSG) {
          return mergeFrom((ru.solverit.net.packet.Packet.PacketMSG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(ru.solverit.net.packet.Packet.PacketMSG other) {
        if (other == ru.solverit.net.packet.Packet.PacketMSG.getDefaultInstance()) return this;
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        if (other.hasIdsess()) {
          setIdsess(other.getIdsess());
        }
        if (other.hasPing()) {
          setPing(other.getPing());
        }
        if (other.hasCmd()) {
          setCmd(other.getCmd());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasIdsess()) {
          
          return false;
        }
        if (!hasPing()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              time_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              idsess_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              ping_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              cmd_ = input.readInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              data_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 time = 1;
      private long time_ ;
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTime() {
        return time_;
      }
      public Builder setTime(long value) {
        bitField0_ |= 0x00000001;
        time_ = value;
        onChanged();
        return this;
      }
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 idsess = 2;
      private long idsess_ ;
      public boolean hasIdsess() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getIdsess() {
        return idsess_;
      }
      public Builder setIdsess(long value) {
        bitField0_ |= 0x00000002;
        idsess_ = value;
        onChanged();
        return this;
      }
      public Builder clearIdsess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        idsess_ = 0L;
        onChanged();
        return this;
      }
      
      // required bool ping = 3;
      private boolean ping_ ;
      public boolean hasPing() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getPing() {
        return ping_;
      }
      public Builder setPing(boolean value) {
        bitField0_ |= 0x00000004;
        ping_ = value;
        onChanged();
        return this;
      }
      public Builder clearPing() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ping_ = false;
        onChanged();
        return this;
      }
      
      // optional int32 cmd = 4;
      private int cmd_ ;
      public boolean hasCmd() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getCmd() {
        return cmd_;
      }
      public Builder setCmd(int value) {
        bitField0_ |= 0x00000008;
        cmd_ = value;
        onChanged();
        return this;
      }
      public Builder clearCmd() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cmd_ = 0;
        onChanged();
        return this;
      }
      
      // optional bytes data = 5;
      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasData() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        data_ = value;
        onChanged();
        return this;
      }
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000010);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ru.solverit.net.packet.PacketMSG)
    }
    
    static {
      defaultInstance = new PacketMSG(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ru.solverit.net.packet.PacketMSG)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ru_solverit_net_packet_PacketMSG_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ru_solverit_net_packet_PacketMSG_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014packet.proto\022\026ru.solverit.net.packet\"R" +
      "\n\tPacketMSG\022\014\n\004time\030\001 \002(\003\022\016\n\006idsess\030\002 \002(" +
      "\003\022\014\n\004ping\030\003 \002(\010\022\013\n\003cmd\030\004 \001(\005\022\014\n\004data\030\005 \001" +
      "(\014B \n\026ru.solverit.net.packetB\006Packet"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ru_solverit_net_packet_PacketMSG_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ru_solverit_net_packet_PacketMSG_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ru_solverit_net_packet_PacketMSG_descriptor,
              new java.lang.String[] { "Time", "Idsess", "Ping", "Cmd", "Data", },
              ru.solverit.net.packet.Packet.PacketMSG.class,
              ru.solverit.net.packet.Packet.PacketMSG.Builder.class);
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