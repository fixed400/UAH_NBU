package com.currency_rate.grd.uah_rate.view;

/**
 * Created by grd on 2/8/17.
 */

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.util.Log;

import com.currency_rate.grd.uah_rate.R;

import static com.currency_rate.grd.uah_rate.MainActivity.LOG_TAG;

public  class InfoDialog extends DialogFragment {

    // @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Linkify the message
        final SpannableString link = new SpannableString("https://www.bank.gov.ua");
        Linkify.addLinks(link, Linkify.ALL);

        builder.setTitle("Данные получены с")
                .setMessage(R.string.data_link)
               // .setMessage(Html.fromHtml("<a href=\"https://www.bank.gov.ua\">Check this link out</a>"))
               // .setMessage(link)

                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                }) .setPositiveButton("Посетить сайт", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://www.bank.gov.ua"));
                            getActivity().startActivity(i);
                            getDialog().dismiss();
                    }
                });

        return builder.create();
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d(LOG_TAG, "Dialog 1: onDismiss");
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d(LOG_TAG, "Dialog 1: onCancel");
    }
}
