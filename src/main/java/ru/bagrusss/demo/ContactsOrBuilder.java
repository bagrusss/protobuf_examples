// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package ru.bagrusss.demo;

public interface ContactsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:demo.Contacts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .demo.User people = 1;</code>
   */
  java.util.List<ru.bagrusss.demo.User> 
      getPeopleList();
  /**
   * <code>repeated .demo.User people = 1;</code>
   */
  ru.bagrusss.demo.User getPeople(int index);
  /**
   * <code>repeated .demo.User people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .demo.User people = 1;</code>
   */
  java.util.List<? extends ru.bagrusss.demo.UserOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .demo.User people = 1;</code>
   */
  ru.bagrusss.demo.UserOrBuilder getPeopleOrBuilder(
      int index);
}
