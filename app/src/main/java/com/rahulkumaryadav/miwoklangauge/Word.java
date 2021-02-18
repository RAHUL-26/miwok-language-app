package com.rahulkumaryadav.miwoklangauge;

public class Word {
    private String foreignWord;
    private String nativeWord;
    private int imageResourceId= NO_IMAGE_PROVIDED;
    private int audioResourceId;
  //  private int playPauseBtn = playIcon;

    private static final int NO_IMAGE_PROVIDED = -1;
  //  private static final int playIcon = android.R.drawable.ic_media_play;

    public Word(String foreignWord, String nativeWord,int imageResourceId,int audioResourceId) {
        this.foreignWord = foreignWord;
        this.nativeWord = nativeWord;
        this.imageResourceId=imageResourceId;
        this.audioResourceId=audioResourceId;
    }
    public Word(String foreignWord, String nativeWord,int audioResourceId) {
        this.foreignWord = foreignWord;
        this.nativeWord = nativeWord;
        this.audioResourceId=audioResourceId;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public void setAudioResourceId(int audioResourceId) {
        this.audioResourceId = audioResourceId;
    }

    public String getForeignWord() {
        return foreignWord;
    }

    public void setForeignWord(String foreignWord) {
        this.foreignWord = foreignWord;
    }

    public String getNativeWord() {
        return nativeWord;
    }

    public void setNativeWord(String nativeWord) {
        this.nativeWord = nativeWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "foreignWord='" + foreignWord + '\'' +
                ", nativeWord='" + nativeWord + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }
}
