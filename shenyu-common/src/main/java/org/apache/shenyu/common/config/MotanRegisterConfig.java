/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * Contributor license agreements.See the NOTICE file distributed with
 * This work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * he License.You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.shenyu.common.config;

import java.io.Serializable;
import java.util.Objects;

/**
 * Motan register config.
 */
public class MotanRegisterConfig implements Serializable {

    private String register;

    /**
     * get register.
     *
     * @return register
     */
    public String getRegister() {
        return register;
    }

    /**
     * set register.
     *
     * @param register register
     */
    public void setRegister(final String register) {
        this.register = register;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MotanRegisterConfig that = (MotanRegisterConfig) o;
        return Objects.equals(register, that.register);
    }

    @Override
    public int hashCode() {
        return Objects.hash(register);
    }

    @Override
    public String toString() {
        return "MotanRegisterConfig{"
                + "register='"
                + register
                + '\''
                + '}';
    }
}
