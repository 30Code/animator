/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
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
package cn.linhome.lib.animator.aligner;

import android.view.View;

import cn.linhome.lib.animator.ExtendedPropertyAnimator;

/**
 * x方向动画view和对齐view中心点对齐
 */
public class XCenterAligner implements ExtendedPropertyAnimator.Aligner
{
    @Override
    public int align(View animatorView, View alignView, int alignViewPosition)
    {
        final int delta = alignView.getWidth() / 2 - animatorView.getWidth() / 2;
        return alignViewPosition + delta;
    }
}
