package com.fclongoo.querytolerence;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    //    Button sp1;
//    Button sp2;
//    Button sp3;
//    int spIndex1 = 1;
//    int spIndex2 = 10;
//    int spIndex3 = 6;
    SharedPreferences preferences;
    EditText editText;
    TextView tvNSize;
    TextView tvTolerence;

    NumberPicker numberPickerSymbol;
    NumberPicker numberPickerLevel;

    RadioGroup radioGroupBase;

//    ArrayAdapter<String> adapter_blank;
//    ArrayAdapter<String> adapter1;
//    ArrayAdapter<String> adapter2;
//    ArrayAdapter<String> adapter3;
//    AlertDialog.Builder builder1;
//    AlertDialog.Builder builder2;
//    AlertDialog.Builder builder3;
//
//    DialogInterface.OnClickListener builderclicklistener1;
//    DialogInterface.OnClickListener builderclicklistener2;
//    DialogInterface.OnClickListener builderclicklistener3;

    //    final String[] ahs = {"基轴制", "基孔制"};
    final static String[] Symbols = {"a", "b", "c", "cd", "d", "e", "ef", "f",
            "fg", "g", "h", "j", "js", "k", "m", "n", "p", "r", "s", "t", "u",
            "v", "x", "y", "z", "za", "zb", "zc"};
    String[] symbols_hole;

//    List<String> list1 = new ArrayList<String>();
//    List<String> list2 = new ArrayList<String>();
//    List<String> list3 = new ArrayList<String>();
//    List<String> list_blank = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        symbols_hole = new String[Symbols.length];
        for (int i = 0; i < Symbols.length; i++) {
            symbols_hole[i] = Symbols[i].toUpperCase();
        }

//        sp1 = (Button) findViewById(R.id.btnspinner1);
//        for (int i = 0; i < ahs.length; i++) {
//            list1.add(ahs[i]);
//        }
//        adapter1 = new ArrayAdapter<String>(this,
//                android.R.layout.select_dialog_singlechoice, list1);

        /*
         * sp1.setAdapter(adapter1); sp1.setOnItemSelectedListener(new
         * OnItemSelectedListener() {
         *
         * public void onItemSelected(AdapterView<?> parent, View view, int
         * position, long id) { int i;
         *
         * adapter2.clear(); int pos = sp2.getSelectedItemPosition(); for (i =
         * 0; i < Symbols.length; i++) { adapter2.add((position == 0) ?
         * Symbols[i] : Symbols[i] .toUpperCase(Locale.US)); }
         * sp2.setSelection(pos, true); }
         *
         * public void onNothingSelected(AdapterView<?> parent) { } });
         */
//        sp1.setText(adapter1.getItem(1).toUpperCase(Locale.US));
//        sp1.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                builder1.setSingleChoiceItems( // 设置单选列表选项
//                        adapter1, spIndex1, builderclicklistener1);
//                builder1.show();
//            }
//        });
//
//        builder1 = new AlertDialog.Builder(this); // 创建Builder对象
        // b.setIcon(R.drawable.header); //设置图标
        // b.setTitle(R.string.title); //设置标题
        /*
         * builder1.setSingleChoiceItems( // 设置单选列表选项 adapter1, 1, // 默认选中状态
         * 下表从零开始 区别去多选对话框 new DialogInterface.OnClickListener() {
         *
         * @Override public void onClick(DialogInterface dialog, int which) {
         * sp1.setText(adapter1.getItem(which)); String
         * s=sp2.getText().toString().trim();
         * sp2.setText((which==0)?s.toLowerCase():s.toUpperCase(Locale.US));
         * dialog.dismiss(); Log.v("b", "chico"); } });
         */
//        builderclicklistener1 = new DialogInterface.OnClickListener() {
//            @SuppressLint("DefaultLocale")
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                spIndex1 = which;
//                sp1.setText(adapter1.getItem(which));
//                String s = sp2.getText().toString().trim();
//                sp2.setText((which == 0) ? s.toLowerCase(Locale.US) : s
//                        .toUpperCase(Locale.US));
//                dialog.dismiss();
//                Log.v("b", "chico");
//            }
//        };
//
//        sp2 = (Button) findViewById(R.id.btnspinner2);
//
//        // same as 'android:textAllCaps="false"'
//        // sp2.setTransformationMethod(null);
//        for (int i = 0; i < Symbols.length; i++) {
//            list2.add(Symbols[i]);
//        }
//        adapter2 = new ArrayAdapter<String>(this,
//                android.R.layout.select_dialog_singlechoice, list2);
//        adapter_blank = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, list_blank);
        /*
         * sp2.setAdapter(adapter2);
         *
         * sp3 = (Button) findViewById(R.id.btnspinner3);
         */

//        sp2.setText(adapter2.getItem(10).toUpperCase(Locale.US));
//        sp2.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // builder2.setSingleChoiceItems(null, -1, null);
//                builder2.setSingleChoiceItems( // 设置单选列表选项
//                        adapter_blank, -1, null);
//
//                adapter2.clear();
//                for (int i = 0; i < Symbols.length; i++) {
//                    adapter2.add((spIndex1 == 0) ? Symbols[i] : Symbols[i]
//                            .toUpperCase(Locale.US));
//                }
//                // builder2.setSingleChoiceItems(null, -1, null);
//                builder2.setSingleChoiceItems( // 设置单选列表选项
//                        adapter2, spIndex2,// adapter2.getPosition(sp2.getText().toString().trim()),
//                        // // 默认选中状态 下表从零开始 区别去多选对话框
//                        builderclicklistener2);
//                builder2.show();
//            }
//        });

//        builder2 = new AlertDialog.Builder(this); // 创建Builder对象
//        // b.setIcon(R.drawable.header); //设置图标
//        // b.setTitle(R.string.title); //设置标题
//
//        builderclicklistener2 = new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                spIndex2 = which;
//                sp2.setText(adapter2.getItem(which));
//                dialog.dismiss();
//                Log.v("b", "chico");
//            }
//        };

        /*
         * builder2.setSingleChoiceItems( // 设置单选列表选项 adapter2, 10, // 默认选中状态
         * 下表从零开始 区别去多选对话框 builderclicklistener);
         */
        /*
         * new DialogInterface.OnClickListener() {
         *
         * @Override public void onClick(DialogInterface dialog, int which) {
         * sp2.setText(adapter2.getItem(which)); dialog.dismiss(); Log.v("b",
         * "chico"); } });
         */

//        for (int i = 0; i < 18; i++) {
//            list3.add(Integer.toString(i + 1));
//        }
//        adapter3 = new ArrayAdapter<String>(this,
//                android.R.layout.select_dialog_singlechoice, list3);

        /*
         * sp3.setAdapter(adapter3); sp3.setSelection(6, true);
         */
//        sp3 = (Button) findViewById(R.id.btnspinner3);
//        sp3.setText("7");
//        sp3.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                builder3.setSingleChoiceItems( // 设置单选列表选项
//                        adapter3, spIndex3, // 默认选中状态 下表从零开始 区别去多选对话框
//                        builderclicklistener3);
//                builder3.show();
//            }
//        });

        // sp2.setSelection(10, true);
        // sp1.setSelection(1, true);
        tvNSize = (TextView) findViewById(R.id.tvNSize);
        tvTolerence = (TextView) findViewById(R.id.tvTolerence);
        // tvTolerence.setText("-0.070\n-0.145");
        // tvTolerence.setTextSize(24);
        // tvTolerence.setText("±0.135");

        editText = (EditText) findViewById(R.id.etSize);

//        builder3 = new AlertDialog.Builder(this); // 创建Builder对象
        // b.setIcon(R.drawable.header); //设置图标
        // b.setTitle(R.string.title); //设置标题
        /*
         * builder3.setSingleChoiceItems( // 设置单选列表选项 adapter3, 6, // 默认选中状态
         * 下表从零开始 区别去多选对话框 new DialogInterface.OnClickListener() {
         *
         * @Override public void onClick(DialogInterface dialog, int which) {
         * sp3.setText(Integer.toString(which + 1)); dialog.dismiss();
         * Log.v("b", "chico"); } });
         */
//        builderclicklistener3 = new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                spIndex3 = which;
//                sp3.setText(Integer.toString(which + 1));
//                dialog.dismiss();
//                Log.v("b", "chico");
//            }
//        };

        LayoutInflater inflater = getLayoutInflater();
        View number_pad = inflater.inflate(R.layout.number_pad, null);
        Button btnDone = (Button) number_pad.findViewById(R.id.button14);
        btnDone.setText(getResources().getString(R.string.tolquery));
        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editText.requestFocus();
                click(v);

            }
        });
        LinearLayout ll = (LinearLayout) findViewById(R.id.LinearLayoutNumberPad);
        ll.addView(number_pad);

        ImageButton btn_backspace = (ImageButton) number_pad
                .findViewById(R.id.button13);
        btn_backspace.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (editText == null)
                    return;
                int start = editText.getSelectionStart();

                int end = editText.getSelectionEnd();

                if (start == 0 && end == 0)
                    return;

                String newText = editText.getText().toString();
                if (end > start) {
                    newText = newText.substring(0, start)
                            + newText.substring(end);
                } else {
                    start--;
                    newText = newText.substring(0, start)
                            + newText.substring(end);
                }
                editText.setText(newText);
                editText.setSelection(start);
            }
        });

        btn_backspace.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                if (editText == null)
                    return false;

                editText.setText("");
                return true;
            }
        });

        Button[] number_btns = new Button[]{
                (Button) number_pad.findViewById(R.id.button1),
                (Button) number_pad.findViewById(R.id.button2),
                (Button) number_pad.findViewById(R.id.button3),
                (Button) number_pad.findViewById(R.id.button4),
                (Button) number_pad.findViewById(R.id.button5),
                (Button) number_pad.findViewById(R.id.button6),
                (Button) number_pad.findViewById(R.id.button7),
                (Button) number_pad.findViewById(R.id.button8),
                (Button) number_pad.findViewById(R.id.button9),
                (Button) number_pad.findViewById(R.id.button10),
                (Button) number_pad.findViewById(R.id.button11),
                (Button) number_pad.findViewById(R.id.button12)};

        for (Button number_btn : number_btns) {
            number_btn.setOnClickListener(number_btn_onClick);
        }

        disableShowSoftInput();
        editText.setTextIsSelectable(true);

        numberPickerSymbol = findViewById(R.id.numberPickerSymbol);
        numberPickerSymbol.setDisplayedValues(preferences.getBoolean("isHole", true)?symbols_hole:Symbols);
        numberPickerSymbol.setMinValue(0);
        numberPickerSymbol.setMaxValue(Symbols.length - 1);
        numberPickerSymbol.setValue(preferences.getInt("symbol", 10));
        numberPickerSymbol.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                doCal();
            }
        });

        numberPickerLevel = findViewById(R.id.numberPickerLevel);
        numberPickerLevel.setMaxValue(18);
        numberPickerLevel.setMinValue(1);
        numberPickerLevel.setValue(preferences.getInt("level", 7));
        numberPickerLevel.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                doCal();
            }
        });

        radioGroupBase = findViewById(R.id.radioGroupBase);
        ((RadioButton) findViewById(preferences.getBoolean("isHole", true) ? R.id.radioButtonHole : R.id.radioButtonShaft)).setChecked(true);

        radioGroupBase.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonHole) {
                    numberPickerSymbol.setDisplayedValues(symbols_hole);
                } else {
                    numberPickerSymbol.setDisplayedValues(Symbols);
                }
                doCal();
            }
        });

//        // 如下是内容为空的配置，需要两个属性结合使用；如果有默认值，进行相反的配置
//        // 设置文字的对齐方式
//        editText.setGravity(Gravity.START | Gravity.CENTER_VERTICAL);
//        // 设置文本的显示方向
//        editText.setTextDirection(View.TEXT_DIRECTION_RTL);

        editText.setGravity(Gravity.END | Gravity.CENTER_VERTICAL);
        editText.setTextDirection(View.TEXT_DIRECTION_LTR);
        editText.requestFocus();
        editText.setText(preferences.getString("size", "10"));
        editText.setSelection(editText.getText().length());
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
//                if (TextUtils.isEmpty(s.toString())) {
//                    editText.setGravity(Gravity.START | Gravity.CENTER_VERTICAL);
//                    editText.setTextDirection(View.TEXT_DIRECTION_RTL);
//                } else {
//                    editText.setGravity(Gravity.END | Gravity.CENTER_VERTICAL);
//                    editText.setTextDirection(View.TEXT_DIRECTION_LTR);
//                }
                doCal();
            }
        });
        doCal();
    }

    private View.OnClickListener number_btn_onClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            addText(btn.getText().toString());
        }
    };

    public void addText(String text) {
        if (editText == null)
            return;
        String newText = editText.getText().toString();
        int start = editText.getSelectionStart();
        int end = editText.getSelectionEnd();
        newText = newText.substring(0, start) + text + newText.substring(end);
        try {
            Double.parseDouble(newText);
            editText.setText(newText);
            start += text.length();
            editText.setSelection(start);
        } catch (Exception ignored) {

        }
    }

    private void doCal() {
        boolean isHole = radioGroupBase.getCheckedRadioButtonId() == R.id.radioButtonHole;

        String s;
        String symbol = !isHole ? Symbols[numberPickerSymbol.getValue()] : Symbols[numberPickerSymbol.getValue()]
                .toUpperCase(Locale.US);

        String text = editText.getText().toString().trim();

//        s = TextUtils.isEmpty(text) ? "-" : text
//                + "("
//                + symbol
//                + (numberPickerLevel.getValue()) + ")";
        s = "("
                + symbol
                + (numberPickerLevel.getValue()) + ")";
        tvNSize.setText(s);
        try {
            double normalsize = Double.parseDouble(text);
            int level = numberPickerLevel.getValue();
            s = GB1800.Query(normalsize, symbol, level);
        } catch (Exception ee) {
            s = "";
        }
        if (s.equals("")) {
            s = "-.---.";
//            Toast t = Toast.makeText(this, "不在查询范围内", Toast.LENGTH_SHORT);
//            t.show();
            tvTolerence.setTextSize(24);
        } else {
            if (symbol.toLowerCase(Locale.US).equals("js")) {
                tvTolerence.setTextSize(24);
            } else {
                tvTolerence.setTextSize(14);
            }
        }

//
//        String s;
//        String symbol = "";
//       boolean isHole = radioGroupBase.getCheckedRadioButtonId() == R.id.radioButtonHole;
//        s = "结果:"
//                + editText.getText().toString().trim()
//                + "("
//                + ((spIndex1 == 0) ? Symbols[spIndex2] : Symbols[spIndex2]
//                .toUpperCase(Locale.US))
//                + Integer.toString(spIndex3 + 1) + ")";
//        tvNSize.setText(s);
//        try {
//
//            double normalsize = Double.parseDouble(editText.getText()
//                    .toString().trim());
//            int level = spIndex3 + 1;
//            symbol = (spIndex1 == 0) ? Symbols[spIndex2] : Symbols[spIndex2]
//                    .toUpperCase(Locale.US);
//            s = GB1800.Query(normalsize, symbol, level);
//        } catch (Exception ee) {
//            s = "";
//        }
//        if (s.equals("")) {
//            s = "-.---.";
//            Toast t = Toast.makeText(this, "不在查询范围内", Toast.LENGTH_SHORT);
//            t.show();
//            tvTolerence.setTextSize(24);
//        } else {
//            if (symbol.toLowerCase(Locale.US).equals("js")) {
//                tvTolerence.setTextSize(24);
//            } else {
//                tvTolerence.setTextSize(14);
//            }
//        }
        tvTolerence.setText(s);

        preferences.edit()
                .putBoolean("isHole", isHole)
                .putInt("symbol", numberPickerSymbol.getValue())
                .putInt("level", numberPickerLevel.getValue())
                .putString("size", text)
                .apply();
    }

    public void click(View v) {
        doCal();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            showAbout();
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void showAbout() {
        new AlertDialog.Builder(this)
                .setIcon(getResources().getDrawable(R.drawable.ic_launcher))
                .setTitle(getResources().getText(R.string.app_name))
                .setMessage(getResources().getText(R.string.copyright))
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                }).show();

    }

    /**
     * 禁止Edittext弹出软件盘，光标依然正常显示。
     */
    public void disableShowSoftInput() {
        Class<EditText> cls = EditText.class;
        Method method;
        try {
            method = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
            method.setAccessible(true);
            method.invoke(editText, false);
        } catch (Exception ignored) {
        }
        try {
            method = cls.getMethod("setSoftInputShownOnFocus", boolean.class);
            method.setAccessible(true);
            method.invoke(editText, false);
        } catch (Exception ignored) {
        }

    }

}
