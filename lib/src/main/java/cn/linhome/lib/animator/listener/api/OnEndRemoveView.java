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
package cn.linhome.lib.animator.listener.api;

import android.view.View;

import cn.linhome.lib.animator.listener.LifecycleListener;
import cn.linhome.lib.animator.listener.RemoveListener;


/**
 * 动画结束移除view
 */
public class OnEndRemoveView extends RemoveListener
{
    public OnEndRemoveView()
    {
        super(LifecycleListener.Lifecycle.END);
    }

    public OnEndRemoveView(View target)
    {
        super(LifecycleListener.Lifecycle.END, target);
    }
}
