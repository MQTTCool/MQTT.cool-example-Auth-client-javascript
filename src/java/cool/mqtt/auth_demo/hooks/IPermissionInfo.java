/*
 * MQTT.Cool - http://MQTT.Cool
 * Authentication and Authorization Demo
 * Copyright (c) Lightstreamer Srl
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cool.mqtt.auth_demo.hooks;

/**
 * Simple interface which exposes queries to check authorized permissions.
 */
public interface IPermissionInfo {

    /**
     * Asks if permission to connect to the specified MQTT broker address is authorized.
     * 
     * @param broker
     *            the MQTT broker address to connect to
     * @return {@code true} if permission is authorized, {@code false} otherwise
     *         F
     */
    boolean allowConnectionTo(String broker);

    /**
     * Asks if permission to subscribe to the specified topic is authorized.
     * 
     * @param topic
     *            the topic to subscribe to
     * @return {@code true} if permission is authorized, {@code false} otherwise
     */
    boolean allowSubscribeTo(String topic);

    /**
     * Asks if permission to publish to the specified topic is authorized.
     * 
     * @param topic
     *            the topic to which publishing a MQTT message.
     * @return {@code true} if permission is authorized, {@code false} otherwise
     */
    boolean allowPublishTo(String topic);

}