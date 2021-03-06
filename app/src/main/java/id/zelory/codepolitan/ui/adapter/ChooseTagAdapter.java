/*
 * Copyright (c) 2015 Zelory.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package id.zelory.codepolitan.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;

import id.zelory.benih.adapter.BenihRecyclerAdapter;
import id.zelory.codepolitan.R;
import id.zelory.codepolitan.data.model.Tag;
import id.zelory.codepolitan.ui.adapter.viewholder.ChooseTagViewHolder;

/**
 * Created on : September 02, 2015
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class ChooseTagAdapter extends BenihRecyclerAdapter<Tag, ChooseTagViewHolder>
{
    public ChooseTagAdapter(Context context)
    {
        super(context);
    }

    @Override
    protected int getItemView(int viewType)
    {
        return R.layout.list_item_choose;
    }

    @Override
    public ChooseTagViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return new ChooseTagViewHolder(getView(parent, viewType), itemClickListener, longItemClickListener);
    }
}
