/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api.entity.living;

import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.projectile.source.ProjectileSource;

/**
 * Represents a HumanEntity in game, such as {@link org.spongepowered.api.entity.player.Player}
 */
public interface Human extends Agent, ProjectileSource, ArmorEquipable {

    /**
     * Gets the hunger value of this human entity.
     * <p>Hunger is a type of exhaustion such that when the exhaustion
     * depletes, saturation may begin to diminish.</p>
     *
     * @return The current hunger
     */
    float getHunger();

    /**
     * Sets the hunger value of this human entity.
     * <p>Hunger is a type of exhaustion such that when the exhaustion
     * depletes, saturation may begin to diminish.</p>
     *
     * @param hunger The hunger level
     */
    void setHunger(float hunger);

    /**
     * Gets the current food saturation of this human entity.
     * <p>Saturation has health effects, depending on game difficulty and
     * hunger levels. If the saturation is high enough, the human entity
     * may heal. If the saturation is at 0, the human entity may starve.</p>
     *
     * @return The current saturation level
     */
    float getSaturation();

    /**
     * Sets the current food saturation of this human entity.
     * <p>Saturation has health effects, depending on game difficulty and
     * hunger levels. If the saturation is high enough, the human entity
     * may heal. If the saturation is at 0, the human entity may starve.</p>
     *
     * @param saturation The saturation level to set
     */
    void setSaturation(float saturation);

    /**
     * Returns whether this human entity has an open inventory at the moment
     * or not.
     *
     * @return Whether this human is viewing an inventory or not
     */
    boolean isViewingInventory();

    // TODO inventory api
    /*
    Container getOpenInventory();

    void closeInventory();

     */

}
