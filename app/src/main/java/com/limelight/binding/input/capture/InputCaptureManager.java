package com.limelight.binding.input.capture;

import android.app.Activity;

import com.limelight.BuildConfig;
import com.limelight.LimeLog;
import com.limelight.R;
import com.limelight.binding.input.evdev.EvdevCaptureProviderShim;
import com.limelight.binding.input.evdev.EvdevListener;

public class InputCaptureManager {
    public static InputCaptureProvider getInputCaptureProvider(Activity activity, EvdevListener rootListener) {
        // Disable mouse input for Oculus Quest
        return new NullCaptureProvider();
    }
}
