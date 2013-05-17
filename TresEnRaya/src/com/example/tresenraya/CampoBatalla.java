package com.example.tresenraya;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;

public class CampoBatalla extends Activity {
	private ImageView im []=new ImageView[9];
	private boolean jugador1=true;
	private boolean jugador2=false;
	public void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.pantalla_juego);
	}
	
	public void cambiarBoton(View v){
		
		if(jugador1){
			((ImageView)v).setImageResource(R.drawable.cruz);
			jugador1=false;
			
		}
		else
			if(!jugador2){
				((ImageView)v).setImageResource(R.drawable.circulo);
				jugador1=true;
			}
	}
	
	public void bReset(View v){
		
		im[0]=(ImageView) findViewById(R.id.c1);
		im[1]=(ImageView) findViewById(R.id.c2);
		im[2]=(ImageView) findViewById(R.id.c3);
		im[3]=(ImageView) findViewById(R.id.c4);
		im[4]=(ImageView) findViewById(R.id.c5);
		im[5]=(ImageView) findViewById(R.id.c6);
		im[6]=(ImageView) findViewById(R.id.c7);
		im[7]=(ImageView) findViewById(R.id.c8);
		im[8]=(ImageView) findViewById(R.id.c9);
				
		for(int i=0;i<im.length;i++)
			im[i].setImageResource(R.drawable.vacio);
		
	}
	
	
}
