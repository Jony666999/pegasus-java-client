// Copyright (c) 2017, Xiaomi, Inc.  All rights reserved.
// This source code is licensed under the Apache License Version 2.0, which
// can be found in the LICENSE file in the root directory of this source tree.
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.pegasus.replication;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-03-12")
public class query_cfg_response implements com.xiaomi.infra.pegasus.thrift.TBase<query_cfg_response, query_cfg_response._Fields>, java.io.Serializable, Cloneable, Comparable<query_cfg_response> {
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TStruct STRUCT_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TStruct("query_cfg_response");

  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField ERR_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("err", com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, (short)1);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField APP_ID_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("app_id", com.xiaomi.infra.pegasus.thrift.protocol.TType.I32, (short)2);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField PARTITION_COUNT_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("partition_count", com.xiaomi.infra.pegasus.thrift.protocol.TType.I32, (short)3);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField IS_STATEFUL_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("is_stateful", com.xiaomi.infra.pegasus.thrift.protocol.TType.BOOL, (short)4);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField PARTITIONS_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("partitions", com.xiaomi.infra.pegasus.thrift.protocol.TType.LIST, (short)5);

  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new query_cfg_responseStandardSchemeFactory();
  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new query_cfg_responseTupleSchemeFactory();

  public com.xiaomi.infra.pegasus.base.error_code err; // required
  public int app_id; // required
  public int partition_count; // required
  public boolean is_stateful; // required
  public java.util.List<partition_configuration> partitions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.xiaomi.infra.pegasus.thrift.TFieldIdEnum {
    ERR((short)1, "err"),
    APP_ID((short)2, "app_id"),
    PARTITION_COUNT((short)3, "partition_count"),
    IS_STATEFUL((short)4, "is_stateful"),
    PARTITIONS((short)5, "partitions");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERR
          return ERR;
        case 2: // APP_ID
          return APP_ID;
        case 3: // PARTITION_COUNT
          return PARTITION_COUNT;
        case 4: // IS_STATEFUL
          return IS_STATEFUL;
        case 5: // PARTITIONS
          return PARTITIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __APP_ID_ISSET_ID = 0;
  private static final int __PARTITION_COUNT_ISSET_ID = 1;
  private static final int __IS_STATEFUL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERR, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("err", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.error_code.class)));
    tmpMap.put(_Fields.APP_ID, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("app_id", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.FieldValueMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARTITION_COUNT, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("partition_count", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.FieldValueMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_STATEFUL, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("is_stateful", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.FieldValueMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PARTITIONS, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("partitions", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.ListMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.LIST, 
            new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, partition_configuration.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData.addStructMetaDataMap(query_cfg_response.class, metaDataMap);
  }

  public query_cfg_response() {
  }

  public query_cfg_response(
    com.xiaomi.infra.pegasus.base.error_code err,
    int app_id,
    int partition_count,
    boolean is_stateful,
    java.util.List<partition_configuration> partitions)
  {
    this();
    this.err = err;
    this.app_id = app_id;
    setApp_idIsSet(true);
    this.partition_count = partition_count;
    setPartition_countIsSet(true);
    this.is_stateful = is_stateful;
    setIs_statefulIsSet(true);
    this.partitions = partitions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public query_cfg_response(query_cfg_response other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetErr()) {
      this.err = new com.xiaomi.infra.pegasus.base.error_code(other.err);
    }
    this.app_id = other.app_id;
    this.partition_count = other.partition_count;
    this.is_stateful = other.is_stateful;
    if (other.isSetPartitions()) {
      java.util.List<partition_configuration> __this__partitions = new java.util.ArrayList<partition_configuration>(other.partitions.size());
      for (partition_configuration other_element : other.partitions) {
        __this__partitions.add(new partition_configuration(other_element));
      }
      this.partitions = __this__partitions;
    }
  }

  public query_cfg_response deepCopy() {
    return new query_cfg_response(this);
  }

  @Override
  public void clear() {
    this.err = null;
    setApp_idIsSet(false);
    this.app_id = 0;
    setPartition_countIsSet(false);
    this.partition_count = 0;
    setIs_statefulIsSet(false);
    this.is_stateful = false;
    this.partitions = null;
  }

  public com.xiaomi.infra.pegasus.base.error_code getErr() {
    return this.err;
  }

  public query_cfg_response setErr(com.xiaomi.infra.pegasus.base.error_code err) {
    this.err = err;
    return this;
  }

  public void unsetErr() {
    this.err = null;
  }

  /** Returns true if field err is set (has been assigned a value) and false otherwise */
  public boolean isSetErr() {
    return this.err != null;
  }

  public void setErrIsSet(boolean value) {
    if (!value) {
      this.err = null;
    }
  }

  public int getApp_id() {
    return this.app_id;
  }

  public query_cfg_response setApp_id(int app_id) {
    this.app_id = app_id;
    setApp_idIsSet(true);
    return this;
  }

  public void unsetApp_id() {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.clearBit(__isset_bitfield, __APP_ID_ISSET_ID);
  }

  /** Returns true if field app_id is set (has been assigned a value) and false otherwise */
  public boolean isSetApp_id() {
    return com.xiaomi.infra.pegasus.thrift.EncodingUtils.testBit(__isset_bitfield, __APP_ID_ISSET_ID);
  }

  public void setApp_idIsSet(boolean value) {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.setBit(__isset_bitfield, __APP_ID_ISSET_ID, value);
  }

  public int getPartition_count() {
    return this.partition_count;
  }

  public query_cfg_response setPartition_count(int partition_count) {
    this.partition_count = partition_count;
    setPartition_countIsSet(true);
    return this;
  }

  public void unsetPartition_count() {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARTITION_COUNT_ISSET_ID);
  }

  /** Returns true if field partition_count is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_count() {
    return com.xiaomi.infra.pegasus.thrift.EncodingUtils.testBit(__isset_bitfield, __PARTITION_COUNT_ISSET_ID);
  }

  public void setPartition_countIsSet(boolean value) {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.setBit(__isset_bitfield, __PARTITION_COUNT_ISSET_ID, value);
  }

  public boolean isIs_stateful() {
    return this.is_stateful;
  }

  public query_cfg_response setIs_stateful(boolean is_stateful) {
    this.is_stateful = is_stateful;
    setIs_statefulIsSet(true);
    return this;
  }

  public void unsetIs_stateful() {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_STATEFUL_ISSET_ID);
  }

  /** Returns true if field is_stateful is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_stateful() {
    return com.xiaomi.infra.pegasus.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_STATEFUL_ISSET_ID);
  }

  public void setIs_statefulIsSet(boolean value) {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_STATEFUL_ISSET_ID, value);
  }

  public int getPartitionsSize() {
    return (this.partitions == null) ? 0 : this.partitions.size();
  }

  public java.util.Iterator<partition_configuration> getPartitionsIterator() {
    return (this.partitions == null) ? null : this.partitions.iterator();
  }

  public void addToPartitions(partition_configuration elem) {
    if (this.partitions == null) {
      this.partitions = new java.util.ArrayList<partition_configuration>();
    }
    this.partitions.add(elem);
  }

  public java.util.List<partition_configuration> getPartitions() {
    return this.partitions;
  }

  public query_cfg_response setPartitions(java.util.List<partition_configuration> partitions) {
    this.partitions = partitions;
    return this;
  }

  public void unsetPartitions() {
    this.partitions = null;
  }

  /** Returns true if field partitions is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitions() {
    return this.partitions != null;
  }

  public void setPartitionsIsSet(boolean value) {
    if (!value) {
      this.partitions = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERR:
      if (value == null) {
        unsetErr();
      } else {
        setErr((com.xiaomi.infra.pegasus.base.error_code)value);
      }
      break;

    case APP_ID:
      if (value == null) {
        unsetApp_id();
      } else {
        setApp_id((java.lang.Integer)value);
      }
      break;

    case PARTITION_COUNT:
      if (value == null) {
        unsetPartition_count();
      } else {
        setPartition_count((java.lang.Integer)value);
      }
      break;

    case IS_STATEFUL:
      if (value == null) {
        unsetIs_stateful();
      } else {
        setIs_stateful((java.lang.Boolean)value);
      }
      break;

    case PARTITIONS:
      if (value == null) {
        unsetPartitions();
      } else {
        setPartitions((java.util.List<partition_configuration>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERR:
      return getErr();

    case APP_ID:
      return getApp_id();

    case PARTITION_COUNT:
      return getPartition_count();

    case IS_STATEFUL:
      return isIs_stateful();

    case PARTITIONS:
      return getPartitions();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERR:
      return isSetErr();
    case APP_ID:
      return isSetApp_id();
    case PARTITION_COUNT:
      return isSetPartition_count();
    case IS_STATEFUL:
      return isSetIs_stateful();
    case PARTITIONS:
      return isSetPartitions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof query_cfg_response)
      return this.equals((query_cfg_response)that);
    return false;
  }

  public boolean equals(query_cfg_response that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_err = true && this.isSetErr();
    boolean that_present_err = true && that.isSetErr();
    if (this_present_err || that_present_err) {
      if (!(this_present_err && that_present_err))
        return false;
      if (!this.err.equals(that.err))
        return false;
    }

    boolean this_present_app_id = true;
    boolean that_present_app_id = true;
    if (this_present_app_id || that_present_app_id) {
      if (!(this_present_app_id && that_present_app_id))
        return false;
      if (this.app_id != that.app_id)
        return false;
    }

    boolean this_present_partition_count = true;
    boolean that_present_partition_count = true;
    if (this_present_partition_count || that_present_partition_count) {
      if (!(this_present_partition_count && that_present_partition_count))
        return false;
      if (this.partition_count != that.partition_count)
        return false;
    }

    boolean this_present_is_stateful = true;
    boolean that_present_is_stateful = true;
    if (this_present_is_stateful || that_present_is_stateful) {
      if (!(this_present_is_stateful && that_present_is_stateful))
        return false;
      if (this.is_stateful != that.is_stateful)
        return false;
    }

    boolean this_present_partitions = true && this.isSetPartitions();
    boolean that_present_partitions = true && that.isSetPartitions();
    if (this_present_partitions || that_present_partitions) {
      if (!(this_present_partitions && that_present_partitions))
        return false;
      if (!this.partitions.equals(that.partitions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetErr()) ? 131071 : 524287);
    if (isSetErr())
      hashCode = hashCode * 8191 + err.hashCode();

    hashCode = hashCode * 8191 + app_id;

    hashCode = hashCode * 8191 + partition_count;

    hashCode = hashCode * 8191 + ((is_stateful) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetPartitions()) ? 131071 : 524287);
    if (isSetPartitions())
      hashCode = hashCode * 8191 + partitions.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(query_cfg_response other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetErr()).compareTo(other.isSetErr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErr()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.err, other.err);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApp_id()).compareTo(other.isSetApp_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApp_id()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.app_id, other.app_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPartition_count()).compareTo(other.isSetPartition_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_count()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.partition_count, other.partition_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIs_stateful()).compareTo(other.isSetIs_stateful());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_stateful()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.is_stateful, other.is_stateful);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPartitions()).compareTo(other.isSetPartitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitions()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.partitions, other.partitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("query_cfg_response(");
    boolean first = true;

    sb.append("err:");
    if (this.err == null) {
      sb.append("null");
    } else {
      sb.append(this.err);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("app_id:");
    sb.append(this.app_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("partition_count:");
    sb.append(this.partition_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_stateful:");
    sb.append(this.is_stateful);
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitions:");
    if (this.partitions == null) {
      sb.append("null");
    } else {
      sb.append(this.partitions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws com.xiaomi.infra.pegasus.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (err != null) {
      err.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(out)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(in)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class query_cfg_responseStandardSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public query_cfg_responseStandardScheme getScheme() {
      return new query_cfg_responseStandardScheme();
    }
  }

  private static class query_cfg_responseStandardScheme extends com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme<query_cfg_response> {

    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot, query_cfg_response struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERR
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT) {
              struct.err = new com.xiaomi.infra.pegasus.base.error_code();
              struct.err.read(iprot);
              struct.setErrIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_ID
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.I32) {
              struct.app_id = iprot.readI32();
              struct.setApp_idIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_COUNT
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.I32) {
              struct.partition_count = iprot.readI32();
              struct.setPartition_countIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_STATEFUL
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.BOOL) {
              struct.is_stateful = iprot.readBool();
              struct.setIs_statefulIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITIONS
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.LIST) {
              {
                com.xiaomi.infra.pegasus.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.partitions = new java.util.ArrayList<partition_configuration>(_list24.size);
                partition_configuration _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new partition_configuration();
                  _elem25.read(iprot);
                  struct.partitions.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setPartitionsIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot, query_cfg_response struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.err != null) {
        oprot.writeFieldBegin(ERR_FIELD_DESC);
        struct.err.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(APP_ID_FIELD_DESC);
      oprot.writeI32(struct.app_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PARTITION_COUNT_FIELD_DESC);
      oprot.writeI32(struct.partition_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_STATEFUL_FIELD_DESC);
      oprot.writeBool(struct.is_stateful);
      oprot.writeFieldEnd();
      if (struct.partitions != null) {
        oprot.writeFieldBegin(PARTITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new com.xiaomi.infra.pegasus.thrift.protocol.TList(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, struct.partitions.size()));
          for (partition_configuration _iter27 : struct.partitions)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class query_cfg_responseTupleSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public query_cfg_responseTupleScheme getScheme() {
      return new query_cfg_responseTupleScheme();
    }
  }

  private static class query_cfg_responseTupleScheme extends com.xiaomi.infra.pegasus.thrift.scheme.TupleScheme<query_cfg_response> {

    @Override
    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, query_cfg_response struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol oprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetErr()) {
        optionals.set(0);
      }
      if (struct.isSetApp_id()) {
        optionals.set(1);
      }
      if (struct.isSetPartition_count()) {
        optionals.set(2);
      }
      if (struct.isSetIs_stateful()) {
        optionals.set(3);
      }
      if (struct.isSetPartitions()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetErr()) {
        struct.err.write(oprot);
      }
      if (struct.isSetApp_id()) {
        oprot.writeI32(struct.app_id);
      }
      if (struct.isSetPartition_count()) {
        oprot.writeI32(struct.partition_count);
      }
      if (struct.isSetIs_stateful()) {
        oprot.writeBool(struct.is_stateful);
      }
      if (struct.isSetPartitions()) {
        {
          oprot.writeI32(struct.partitions.size());
          for (partition_configuration _iter28 : struct.partitions)
          {
            _iter28.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, query_cfg_response struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol iprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.err = new com.xiaomi.infra.pegasus.base.error_code();
        struct.err.read(iprot);
        struct.setErrIsSet(true);
      }
      if (incoming.get(1)) {
        struct.app_id = iprot.readI32();
        struct.setApp_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.partition_count = iprot.readI32();
        struct.setPartition_countIsSet(true);
      }
      if (incoming.get(3)) {
        struct.is_stateful = iprot.readBool();
        struct.setIs_statefulIsSet(true);
      }
      if (incoming.get(4)) {
        {
          com.xiaomi.infra.pegasus.thrift.protocol.TList _list29 = new com.xiaomi.infra.pegasus.thrift.protocol.TList(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.partitions = new java.util.ArrayList<partition_configuration>(_list29.size);
          partition_configuration _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = new partition_configuration();
            _elem30.read(iprot);
            struct.partitions.add(_elem30);
          }
        }
        struct.setPartitionsIsSet(true);
      }
    }
  }

  private static <S extends com.xiaomi.infra.pegasus.thrift.scheme.IScheme> S scheme(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol proto) {
    return (com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

