package com.coding.apiserver.custom;

import com.coding.apiserver.resource.VResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(VPatch.V1PatchAdapter.class)
public class VPatch extends VResource {

  private String value;

  public static final String PATCH_FORMAT_JSON_PATCH = "application/json-patch+json";
  public static final String PATCH_FORMAT_JSON_MERGE_PATCH = "application/merge-patch+json";
  public static final String PATCH_FORMAT_STRATEGIC_MERGE_PATCH = "application/strategic-merge-patch+json";
  public static final String PATCH_FORMAT_APPLY_YAML = "application/apply-patch+yaml";

  public VPatch(final String value) {
    this.value = value;
  }

  public VPatch() {
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  // path 需要指定资源 kind
  public void setPatchResource(String k_resource){
    super.k_resource = k_resource;
  }

  public static class V1PatchAdapter extends TypeAdapter<VPatch> {
    @Override
    public void write(JsonWriter jsonWriter, VPatch patch) throws IOException {
      jsonWriter.jsonValue(patch.getValue());
    }

    @Override
    public VPatch read(JsonReader jsonReader) throws IOException {
      throw new UnsupportedOperationException("deserializing patch data is not supported");
    }
  }
}
