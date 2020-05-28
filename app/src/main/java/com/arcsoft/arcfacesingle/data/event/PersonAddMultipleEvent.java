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

package com.arcsoft.arcfacesingle.data.event;

public class PersonAddMultipleEvent {

    public boolean showDialog;

    public long delayTime;

    public PersonAddMultipleEvent(boolean showDialog) {
        this.showDialog = showDialog;
    }

    public PersonAddMultipleEvent(boolean showDialog, long delayTime) {
        this.showDialog = showDialog;
        this.delayTime = delayTime;
    }
}