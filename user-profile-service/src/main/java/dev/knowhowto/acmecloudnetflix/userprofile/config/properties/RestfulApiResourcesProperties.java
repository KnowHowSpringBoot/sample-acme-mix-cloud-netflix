package dev.knowhowto.acmecloudnetflix.userprofile.config.properties;

import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "iqkv.service-discovery.services")
public record RestfulApiResourcesProperties(@NonNull String departmentServiceBaseUrl,
                                            @NonNull String departmentServiceUri) {


  public String getDepartmentServiceBaseUrl() {
    return departmentServiceBaseUrl();
  }

  public String getDepartmentServiceUri() {
    return departmentServiceUri();
  }
}
