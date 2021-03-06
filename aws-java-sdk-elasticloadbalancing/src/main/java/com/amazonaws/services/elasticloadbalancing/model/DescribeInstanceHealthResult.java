/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output for DescribeInstanceHealth.
 * </p>
 */
public class DescribeInstanceHealthResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceState> instanceStates;

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     * 
     * @return Information about the health of the instances.
     */

    public java.util.List<InstanceState> getInstanceStates() {
        if (instanceStates == null) {
            instanceStates = new com.amazonaws.internal.SdkInternalList<InstanceState>();
        }
        return instanceStates;
    }

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     * 
     * @param instanceStates
     *        Information about the health of the instances.
     */

    public void setInstanceStates(
            java.util.Collection<InstanceState> instanceStates) {
        if (instanceStates == null) {
            this.instanceStates = null;
            return;
        }

        this.instanceStates = new com.amazonaws.internal.SdkInternalList<InstanceState>(
                instanceStates);
    }

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceStates(java.util.Collection)} or
     * {@link #withInstanceStates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instanceStates
     *        Information about the health of the instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstanceHealthResult withInstanceStates(
            InstanceState... instanceStates) {
        if (this.instanceStates == null) {
            setInstanceStates(new com.amazonaws.internal.SdkInternalList<InstanceState>(
                    instanceStates.length));
        }
        for (InstanceState ele : instanceStates) {
            this.instanceStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the health of the instances.
     * </p>
     * 
     * @param instanceStates
     *        Information about the health of the instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstanceHealthResult withInstanceStates(
            java.util.Collection<InstanceState> instanceStates) {
        setInstanceStates(instanceStates);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceStates() != null)
            sb.append("InstanceStates: " + getInstanceStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceHealthResult == false)
            return false;
        DescribeInstanceHealthResult other = (DescribeInstanceHealthResult) obj;
        if (other.getInstanceStates() == null
                ^ this.getInstanceStates() == null)
            return false;
        if (other.getInstanceStates() != null
                && other.getInstanceStates().equals(this.getInstanceStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceStates() == null) ? 0 : getInstanceStates()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceHealthResult clone() {
        try {
            return (DescribeInstanceHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
