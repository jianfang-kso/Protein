/*
 * Copyright 2017 Jiaheng Ge
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
package com.ge.protein.ui.epoxy;

import com.airbnb.epoxy.EpoxyAdapter;
import com.airbnb.epoxy.EpoxyModel;
import com.ge.protein.ui.epoxy.models.LoadMoreModel;
import com.ge.protein.ui.epoxy.models.LoadMoreModel_;

import java.util.Collection;

public class ProteinAdapter extends EpoxyAdapter {

    private final LoadMoreModel loadMoreModel;

    public ProteinAdapter() {
        loadMoreModel = new LoadMoreModel_();
    }

    public void swap(Collection<? extends EpoxyModel<?>> epoxyModels) {
        removeAllModels();
        addModels(epoxyModels);
    }

    public void addMore(Collection<? extends EpoxyModel<?>> epoxyModels) {
        addModels(epoxyModels);
    }

    public void addModel(EpoxyModel<?> modelToAdd) {
        super.addModel(modelToAdd);
    }

    public void showLoadMore(boolean visible) {
        if (visible) {
            addModel(loadMoreModel);
        } else {
            removeModel(loadMoreModel);
        }
    }
}