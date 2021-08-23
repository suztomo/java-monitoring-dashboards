/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/dashboard.proto

package com.google.monitoring.dashboard.v1;

public final class DashboardsProto {
  private DashboardsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Dashboard_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Dashboard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/monitoring/dashboard/v1/dashboa"
          + "rd.proto\022\036google.monitoring.dashboard.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032,google/monitoring/"
          + "dashboard/v1/layouts.proto\"\270\003\n\tDashboard"
          + "\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\031\n\014display_name\030\002 \001("
          + "\tB\003\340A\002\022\014\n\004etag\030\004 \001(\t\022A\n\013grid_layout\030\005 \001("
          + "\0132*.google.monitoring.dashboard.v1.GridL"
          + "ayoutH\000\022E\n\rmosaic_layout\030\006 \001(\0132,.google."
          + "monitoring.dashboard.v1.MosaicLayoutH\000\022?"
          + "\n\nrow_layout\030\010 \001(\0132).google.monitoring.d"
          + "ashboard.v1.RowLayoutH\000\022E\n\rcolumn_layout"
          + "\030\t \001(\0132,.google.monitoring.dashboard.v1."
          + "ColumnLayoutH\000:S\352AP\n#monitoring.googleap"
          + "is.com/Dashboard\022)projects/{project}/das"
          + "hboards/{dashboard}B\010\n\006layoutB\371\001\n\"com.go"
          + "ogle.monitoring.dashboard.v1B\017Dashboards"
          + "ProtoP\001ZGgoogle.golang.org/genproto/goog"
          + "leapis/monitoring/dashboard/v1;dashboard"
          + "\252\002$Google.Cloud.Monitoring.Dashboard.V1\312"
          + "\002$Google\\Cloud\\Monitoring\\Dashboard\\V1\352\002"
          + "(Google::Cloud::Monitoring::Dashboard::V"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.LayoutsProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_Dashboard_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Dashboard_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Dashboard_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Etag",
              "GridLayout",
              "MosaicLayout",
              "RowLayout",
              "ColumnLayout",
              "Layout",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.dashboard.v1.LayoutsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
