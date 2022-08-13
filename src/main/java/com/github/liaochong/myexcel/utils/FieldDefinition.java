/*
 * Copyright 2019 liaochong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.liaochong.myexcel.utils;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author liaochong
 * @version 1.0
 */
public class FieldDefinition {

    private Field field;

    private List<Field> parentFields;

    private boolean firstFieldOfGroup;

    public FieldDefinition(Field field) {
        this.field = field;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public List<Field> getParentFields() {
        return parentFields;
    }

    public void setParentFields(List<Field> parentFields) {
        this.parentFields = parentFields;
    }

    public boolean isFirstFieldOfGroup() {
        return firstFieldOfGroup;
    }

    public void setFirstFieldOfGroup(boolean firstFieldOfGroup) {
        this.firstFieldOfGroup = firstFieldOfGroup;
    }
}
