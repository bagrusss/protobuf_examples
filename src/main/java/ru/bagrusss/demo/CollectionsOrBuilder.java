// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collections.proto

package ru.bagrusss.demo;

public interface CollectionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:demo.Collections)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string strings = 1;</code>
   */
  java.util.List<java.lang.String>
      getStringsList();
  /**
   * <code>repeated string strings = 1;</code>
   */
  int getStringsCount();
  /**
   * <code>repeated string strings = 1;</code>
   */
  java.lang.String getStrings(int index);
  /**
   * <code>repeated string strings = 1;</code>
   */
  com.google.protobuf.ByteString
      getStringsBytes(int index);

  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */
  int getUsersMapCount();
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */
  boolean containsUsersMap(
      java.lang.String key);
  /**
   * Use {@link #getUsersMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, ru.bagrusss.demo.User>
  getUsersMap();
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */
  java.util.Map<java.lang.String, ru.bagrusss.demo.User>
  getUsersMapMap();
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */

  ru.bagrusss.demo.User getUsersMapOrDefault(
      java.lang.String key,
      ru.bagrusss.demo.User defaultValue);
  /**
   * <code>map&lt;string, .demo.User&gt; usersMap = 2;</code>
   */

  ru.bagrusss.demo.User getUsersMapOrThrow(
      java.lang.String key);
}
