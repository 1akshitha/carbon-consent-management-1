/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.consent.mgt.core.model;

/**
 * The model representing a PII Category Validity model.
 */
public class PIICategoryValidity {

    private Integer id;
    private String validity;
    private String name;

    public PIICategoryValidity(Integer id, String validity) {

        this.id = id;
        this.validity = validity;
    }

    public PIICategoryValidity(String name, String validity, int id) {

        this.id = id;
        this.validity = validity;
        this.name = name;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getValidity() {

        return validity;
    }

    public void setValidity(String validity) {

        this.validity = validity;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
