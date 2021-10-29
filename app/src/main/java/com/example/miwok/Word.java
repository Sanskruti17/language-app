package com.example.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation , and the image for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGAE_PROVOIDED;

    /** constant for no image state */
    private static final int NO_IMAGAE_PROVOIDED = -1;

    /** Sound resource ID for the word */
    private int mAudioResourceId ;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId =AudioResourceId;
    }
/**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param  mImageResourceId is the Drawable resource Id of the image associated with it
     */
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * return whether or not there is image for this word.
     * @return
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGAE_PROVOIDED;
    }

    /**
     * Return the sound resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}
