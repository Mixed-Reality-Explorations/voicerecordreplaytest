package io.github.molecule.voice_record_replay_test.VuforiaSampleCode;

import com.vuforia.State;

/**
 * The SampleAppRendererControl interface is implemented
 * by each activity that uses SampleApplicationSession
 */
public interface SampleAppRendererControl
{
    // This method must be implemented by the Renderer class that handles the content rendering.
    // This function is called for each view inside of a loop
    void renderFrame(State state, float[] projectionMatrix);

}