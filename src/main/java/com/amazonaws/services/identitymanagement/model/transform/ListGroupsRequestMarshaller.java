/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Groups Request Marshaller
 */
public class ListGroupsRequestMarshaller implements Marshaller<Request<ListGroupsRequest>, ListGroupsRequest> {

    public Request<ListGroupsRequest> marshall(ListGroupsRequest listGroupsRequest) {
        Request<ListGroupsRequest> request = new DefaultRequest<ListGroupsRequest>(listGroupsRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListGroups");
        request.addParameter("Version", "2010-05-08");
        if (listGroupsRequest != null) {
            if (listGroupsRequest.getPathPrefix() != null) {
                request.addParameter("PathPrefix", StringUtils.fromString(listGroupsRequest.getPathPrefix()));
            }
        }
        if (listGroupsRequest != null) {
            if (listGroupsRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(listGroupsRequest.getMarker()));
            }
        }
        if (listGroupsRequest != null) {
            if (listGroupsRequest.getMaxItems() != null) {
                request.addParameter("MaxItems", StringUtils.fromInteger(listGroupsRequest.getMaxItems()));
            }
        }


        return request;
    }
}