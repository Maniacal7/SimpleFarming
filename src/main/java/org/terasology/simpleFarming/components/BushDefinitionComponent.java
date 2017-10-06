/*
 * Copyright 2017 MovingBlocks
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
package org.terasology.simpleFarming.components;

import com.google.common.collect.Maps;
import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.prefab.Prefab;
import org.terasology.math.geom.Vector3i;

import java.util.Map;

/**
 * Stores the properties needed to grow a bush.
 * Should be added to bush prefabs in order to be able to have them planted (via a SeedDefinitionComponent)
 */
public class BushDefinitionComponent implements Component {
    public Map<String, GrowthStage> growthStages = Maps.newTreeMap();
    public GrowthStage[] stages;
    public Vector3i position;
    public boolean sustainable = true;
    public EntityRef parent;
    public String seed;
    public String produce;
    public int currentStage;
}
