/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package openbns.commons.net.codec.sts;


/**
 * An interface that defines a HTTP message, providing common properties for
 * {@link StsRequest} and {@link StsResponse}.
 *
 * @see StsResponse
 * @see StsRequest
 * @see StsHeaders
 */
public interface StsMessage extends StsObject
{

    /**
     * Returns the protocol version of this {@link StsMessage}
     *
     * @return The protocol version
     */
    StsVersion getProtocolVersion();

    /**
     * Set the protocol version of this {@link StsMessage}
     */
    StsMessage setProtocolVersion( StsVersion version );

    /**
     * Returns the headers of this message.
     */
    StsHeaders headers();
}