package dev.knowhowto.acmecloudnetflix.starter.web.rest;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

@ConstructorBinding
@Validated
@ConfigurationProperties("build")
public record ApplicationBuildInfoProperties(@NotNull String version,
                                             @NotNull String description,
                                             @NotNull String relativePath) {

  public String getVersion() {
    return version();
  }

  public String getDescription() {
    return description();
  }

  public String getRelativePath() {
    return relativePath();
  }
}
