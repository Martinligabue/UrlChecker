package com.trianguloy.urlchecker.utilities;

import android.text.Editable;
import android.text.TextWatcher;

/***
 * TextWatcher empty implementation, so you can override only what you need
 */
public class DefaultTextWatcher implements TextWatcher {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {
    }
}
