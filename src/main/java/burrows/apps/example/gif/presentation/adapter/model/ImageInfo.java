package burrows.apps.example.gif.presentation.adapter.model;


/**
 * Model for the GifAdapter in order to display the gifs.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class ImageInfo {
  final String url;
  final String previewUrl;

  public ImageInfo() {
    this(new Builder());
  }

  public ImageInfo(Builder builder) {
    this.url = builder.url;
    this.previewUrl = builder.previewUrl;
  }

  public String url() {
    return url;
  }

  public String previewUrl() {
    return previewUrl;
  }

  public Builder newBuilder() {
    return new Builder(this);
  }

  public static class Builder {
    String url;
    String previewUrl;

    public Builder() {
    }

    public Builder(ImageInfo imageInfo) {
      this.url = imageInfo.url;
      this.previewUrl = imageInfo.previewUrl;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder previewUrl(String previewUrl) {
      this.previewUrl = previewUrl;
      return this;
    }

    public ImageInfo build() {
      return new ImageInfo(this);
    }
  }

  @Override public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final ImageInfo imageInfo = (ImageInfo) o;

    if (url != null ? !url.equals(imageInfo.url) : imageInfo.url != null) {
      return false;
    }
    return previewUrl != null ? previewUrl.equals(imageInfo.previewUrl) : imageInfo.previewUrl == null;

  }

  @Override public int hashCode() {
    int result = url != null ? url.hashCode() : 0;
    result = 31 * result + (previewUrl != null ? previewUrl.hashCode() : 0);
    return result;
  }
}
