package io.github.spencerpark.jupyter.messages.request;

import com.google.gson.annotations.SerializedName;
import io.github.spencerpark.jupyter.messages.MessageType;

public class InspectRequest {
    public static final MessageType<InspectRequest> MESSAGE_TYPE = MessageType.INSPECT_REQUEST;

    /**
     * The code that the request wants inspected
     */
    protected final String code;

    /**
     * The character index within the code in which the cursor is
     * at. This allows for an inspection
     */
    @SerializedName("cursor_pos")
    protected final int cursorPos;

    /**
     * Either 0 or 1. 0 is the default and in IPython level 1
     * includes the source in the inspection.
     */
    @SerializedName("detail_level")
    protected final int detailLevel;

    public InspectRequest(String code, int cursorPos, int detailLevel) {
        this.code = code;
        this.cursorPos = cursorPos;
        this.detailLevel = detailLevel;
    }

    public String getCode() {
        return code;
    }

    public int getCursorPos() {
        return cursorPos;
    }

    public int getDetailLevel() {
        return detailLevel;
    }
}
