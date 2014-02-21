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

// Don't edit this file!  It is auto-generated by frameworks/rs/api/gen_runtime.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestNativeLog2 extends RSBaseCompute {

    private ScriptC_TestNativeLog2 script;
    private ScriptC_TestNativeLog2Relaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestNativeLog2(mRS);
        scriptRelaxed = new ScriptC_TestNativeLog2Relaxed(mRS);
    }

    private void checkNativeLog2FloatFloat() {
        Allocation inV = CreateRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xe90a9fa42ce5ce9dL);
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.forEach_testNativeLog2FloatFloat(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2FloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.forEach_testNativeLog2FloatFloat(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2FloatFloat: " + e.toString());
        }
    }

    private void checkNativeLog2Float2Float2() {
        Allocation inV = CreateRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x14b4e2f7f4d0f401L);
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.forEach_testNativeLog2Float2Float2(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2Float2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.forEach_testNativeLog2Float2Float2(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2Float2Float2: " + e.toString());
        }
    }

    private void checkNativeLog2Float3Float3() {
        Allocation inV = CreateRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0xa13d382568878c1fL);
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.forEach_testNativeLog2Float3Float3(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2Float3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.forEach_testNativeLog2Float3Float3(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2Float3Float3: " + e.toString());
        }
    }

    private void checkNativeLog2Float4Float4() {
        Allocation inV = CreateRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x2dc58d52dc3e243dL);
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.forEach_testNativeLog2Float4Float4(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2Float4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, GetElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.forEach_testNativeLog2Float4Float4(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeLog2Float4Float4: " + e.toString());
        }
    }

    public void testNativeLog2() {
        checkNativeLog2FloatFloat();
        checkNativeLog2Float2Float2();
        checkNativeLog2Float3Float3();
        checkNativeLog2Float4Float4();
    }
}