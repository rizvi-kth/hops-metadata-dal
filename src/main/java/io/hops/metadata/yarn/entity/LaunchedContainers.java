/*
 * Copyright (C) 2015 hops.io.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.yarn.entity;

/**
 * Pojo representing launchedContainers Map in FiCaSchedulerNode.
 */
public class LaunchedContainers {

  private final String schedulerNodeID;
  private final String containerIdID;
  private final String rmContainerID;

  public LaunchedContainers(String schedulerNodeID, String containerIdID,
      String rmContainerID) {
    this.schedulerNodeID = schedulerNodeID;
    this.containerIdID = containerIdID;
    this.rmContainerID = rmContainerID;
  }

  public String getSchedulerNodeID() {
    return schedulerNodeID;
  }

  public String getContainerIdID() {
    return containerIdID;
  }

  public String getRmContainerID() {
    return rmContainerID;
  }
}
