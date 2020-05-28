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

package com.arcsoft.arcfacesingle.data.db.update;

import com.arcsoft.arcfacesingle.data.db.DBManager;
import com.arcsoft.arcfacesingle.data.db.table.TableSignRecord;
import com.arcsoft.arcfacesingle.data.db.table.TableSignRecord_Table;
import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;

@Migration(version = 5, database = DBManager.class)
public class Migration_5_SignRecord extends AlterTableMigration<TableSignRecord> {

    public Migration_5_SignRecord(Class<TableSignRecord> signRecordClass) {
        super(signRecordClass);
    }

    @Override
    public void onPreMigrate() {
        addColumn(SQLiteType.TEXT, TableSignRecord_Table.recordId.getNameAlias().name());
        addColumn(SQLiteType.TEXT, TableSignRecord_Table.personId.getNameAlias().name());
        addColumn(SQLiteType.TEXT, TableSignRecord_Table.personSetId.getNameAlias().name());
        addColumn(SQLiteType.TEXT, TableSignRecord_Table.faceId.getNameAlias().name());
        addColumn(SQLiteType.TEXT, TableSignRecord_Table.faceInfo.getNameAlias().name());
        addColumn(SQLiteType.INTEGER, TableSignRecord_Table.updateTime.getNameAlias().name());
        addColumn(SQLiteType.INTEGER, TableSignRecord_Table.type.getNameAlias().name());
    }
}
