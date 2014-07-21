/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.uirendering.cts.bitmapverifiers;

/**
 * Checks to see if a Bitmap follows the algorithm provided by the verifier
 */
public abstract class BitmapVerifier {

    /**
     * This will test if the bitmap is good or not.
     */
    public abstract boolean verify(int[] bitmap, int offset, int stride, int width, int height);

    /**
     * This calculates the position in an array that would represent a bitmap given the parameters.
     */
    protected static int indexFromXAndY(int x, int y, int stride, int offset) {
        return x + (y * stride) + offset;
    }
}