// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto.proto

package com.plethora.TestworkClevertec2021.dto;

public final class Dto {
  private Dto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommentDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommentDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NewsDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NewsDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NewsDtoTitle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NewsDtoTitle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListOfComment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListOfComment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListOfNewsTitle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListOfNewsTitle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tdto.proto\"F\n\nCommentDto\022\n\n\002id\030\001 \001(\003\022\014\n" +
      "\004date\030\002 \001(\t\022\014\n\004text\030\003 \001(\t\022\020\n\010username\030\004 " +
      "\001(\t\"e\n\007NewsDto\022\n\n\002id\030\001 \001(\003\022\014\n\004date\030\002 \001(\t" +
      "\022\r\n\005title\030\003 \001(\t\022\014\n\004text\030\004 \001(\t\022#\n\013listCom" +
      "ment\030\005 \001(\0132\016.ListOfComment\"M\n\014NewsDtoTit" +
      "le\022\n\n\002id\030\001 \001(\003\022\014\n\004date\030\002 \001(\t\022\r\n\005title\030\003 " +
      "\001(\t\022\024\n\014sizeComments\030\004 \001(\005\".\n\rListOfComme" +
      "nt\022\035\n\010comments\030\001 \003(\0132\013.CommentDto\"7\n\017Lis" +
      "tOfNewsTitle\022$\n\rnewsDtoTitles\030\001 \003(\0132\r.Ne" +
      "wsDtoTitleB*\n&com.plethora.TestworkCleve" +
      "rtec2021.dtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CommentDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CommentDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommentDto_descriptor,
        new java.lang.String[] { "Id", "Date", "Text", "Username", });
    internal_static_NewsDto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_NewsDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NewsDto_descriptor,
        new java.lang.String[] { "Id", "Date", "Title", "Text", "ListComment", });
    internal_static_NewsDtoTitle_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_NewsDtoTitle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NewsDtoTitle_descriptor,
        new java.lang.String[] { "Id", "Date", "Title", "SizeComments", });
    internal_static_ListOfComment_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ListOfComment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListOfComment_descriptor,
        new java.lang.String[] { "Comments", });
    internal_static_ListOfNewsTitle_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ListOfNewsTitle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListOfNewsTitle_descriptor,
        new java.lang.String[] { "NewsDtoTitles", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
