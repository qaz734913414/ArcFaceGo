 /**
 * Copyright 2020 ArcSoft Corporation Limited. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package com.arcsoft.arcfacesingle.viewmodel.widget;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import android.graphics.Bitmap;

public class BottomViewModel extends BaseObservable {
    @Bindable
    public final ObservableField<Bitmap> fieldLogo = new ObservableField<>();
    public final ObservableField<String> fieldTime = new ObservableField<>();
    public final ObservableField<String> fieldDate = new ObservableField<>();
    public final ObservableField<Integer> fieldStatus = new ObservableField<>();

    public BottomViewModel() {

    }
}
