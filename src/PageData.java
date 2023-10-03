public class PageData {

  private final String AUDIO_PATH;
  private final PageType nextPageType;
  private final PageType previousPageType;

  private PageData(Builder builder) {
    AUDIO_PATH = builder.audioPath;
    nextPageType = builder.nextPageType;
    previousPageType = builder.previousPageType;
  }

  String getAudioPath() {
    return AUDIO_PATH;
  }

  PageType getNextPageType() {
    return nextPageType;
  }

  PageType getPreviousPageType() {
    return previousPageType;
  }
  
  public static class Builder {
    
    private final String audioPath;
    private PageType nextPageType = PageType.EMPTY_PAGE;
    private PageType previousPageType = PageType.EMPTY_PAGE;
    
    public Builder(String audioPath) {
      this.audioPath = audioPath;
    }
    
    public Builder nextPageType(PageType pageType) {
      this.nextPageType = pageType;
      return this;
    }
    
    public Builder previousPageType(PageType pageType) {
      this.previousPageType = pageType;
      return this;
    }
    
    public PageData build() {
      return new PageData(this);
    }
  }
}
