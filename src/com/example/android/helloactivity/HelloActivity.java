/*
 * Copyright (C) 2007 The Android Open Source Project
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

package com.example.android.helloactivity;

import android.app.Activity;
import android.os.Bundle;


/**
 * A minimal "Hello, World!" application.
 */
public class HelloActivity extends Activity {
    public HelloActivity() {
    }

// test not replace @Override    
//    @Override   
//      @Override
// @Override 
    
    
    /**
     * Called with the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //#ifdef FLAG_91
//@        int flag91 = 1;
        //#endif
        
        
        //#ifdef CHANNEL_91
//@        setContentView(R.layout.hello_activity_91);
        //#elifdef CHANNEL_UC
        setContentView(R.layout.hello_activity_uc);
        //#elifdef CHANNEL_QQ
//@        setContentView(R.layout.hello_activity_qq);
        //#endif
    }
}

