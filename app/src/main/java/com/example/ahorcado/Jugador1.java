package com.example.ahorcado;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.ahorcado.R;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Jugador1 extends Activity implements OnClickListener{

	int arrbtn1jug[]=new int[27];
	TextView txtpuntos1jug,puntos1jug;
	Button btnhome1jug,btnfoto;
	ImageView imgfoto;
	MediaPlayer soundjug1;
	String palabraAadivinar;
	int numletras=0;
	String guiones1jug="";
	TextView pnlcentro1jug;
	
	public static String palabraPuntaje="";

	boolean palcompleta1jug=false;
	
	public static int puntaje1jug=200;
	String txt1jug;
	String txtnew1jug="";
	String str= "";
	int numpos1jug=-1;
	boolean band1jug=false;
	
	ImageView cuerpo1jug,manoderecha1jug,manoizquierda1jug,piernaderecha1jug,piernaizquierda1jug;
	
	Button btna1jug,btnb1jug,btnc1jug,btnd1jug,btne1jug,btnf1jug,btng1jug,btnh1jug,btni1jug,btnj1jug,btnk1jug,btnl1jug,btnm1jug,btnn1jug,btnn21jug,btno1jug,btnp1jug,btnq1jug,btnr1jug,btns1jug,btnt1jug,btnu1jug;
	Button btnv1jug,btnw1jug,btnx1jug,btny1jug,btnz1jug;

	int body1jug=0,handright1jug=0,handleft1jug=0,footright1jug=0,footleft1jug=0;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jugador1);

		cuerpo1jug=(ImageView) findViewById(R.id.cuerpo1jug);
		manoderecha1jug=(ImageView) findViewById(R.id.manoderecha1jug);
		manoizquierda1jug=(ImageView) findViewById(R.id.manoizquierda1jug);
		piernaderecha1jug=(ImageView) findViewById(R.id.piernaderecha1jug);
		piernaizquierda1jug=(ImageView) findViewById(R.id.piernaizquierda1jug);

		txtpuntos1jug=(TextView) findViewById(R.id.txtpuntos1jug);
		txtpuntos1jug.setTypeface(Inicio.typeface_chelsea);

		pnlcentro1jug=(TextView) findViewById(R.id.pnlcentro1jug);
		pnlcentro1jug.setTypeface(Inicio.typeface_chelsea);
		pnlcentro1jug.setTextSize(30);

		puntos1jug=(TextView) findViewById(R.id.puntos1jug);
		puntos1jug.setTypeface(Inicio.typeface_chelsea);

		imgfoto=(ImageView) findViewById(R.id.imgfoto);

		btnhome1jug=(Button) findViewById(R.id.btnhome1jug);
		btnhome1jug.setOnClickListener(this);

		btnfoto=(Button) findViewById(R.id.btnfoto);
		btnfoto.setOnClickListener(this);

		if(soundjug1!=null)
			soundjug1.release();

		soundjug1=MediaPlayer.create(this,R.raw.gotsound);
		soundjug1.seekTo(0);
		soundjug1.start();


		btna1jug=(Button) findViewById(R.id.btna1jug);
		btna1jug.setTypeface(Inicio.typeface_chelsea);
		btna1jug.setOnClickListener(this);
		btnb1jug=(Button) findViewById(R.id.btnb1jug);
		btnb1jug.setTypeface(Inicio.typeface_chelsea);
		btnb1jug.setOnClickListener(this);
		btnc1jug=(Button) findViewById(R.id.btnc1jug);
		btnc1jug.setTypeface(Inicio.typeface_chelsea);
		btnc1jug.setOnClickListener(this);
		btnd1jug=(Button) findViewById(R.id.btnd1jug);
		btnd1jug.setTypeface(Inicio.typeface_chelsea);
		btnd1jug.setOnClickListener(this);
		btne1jug=(Button) findViewById(R.id.btne1jug);
		btne1jug.setTypeface(Inicio.typeface_chelsea);
		btne1jug.setOnClickListener(this);
		btnf1jug=(Button) findViewById(R.id.btnf1jug);
		btnf1jug.setTypeface(Inicio.typeface_chelsea);
		btnf1jug.setOnClickListener(this);
		btng1jug=(Button) findViewById(R.id.btng1jug);
		btng1jug.setTypeface(Inicio.typeface_chelsea);
		btng1jug.setOnClickListener(this);
		btnh1jug=(Button) findViewById(R.id.btnh1jug);
		btnh1jug.setTypeface(Inicio.typeface_chelsea);
		btnh1jug.setOnClickListener(this);
		btni1jug=(Button) findViewById(R.id.btni1jug);
		btni1jug.setTypeface(Inicio.typeface_chelsea);
		btni1jug.setOnClickListener(this);
		btnj1jug=(Button) findViewById(R.id.btnj1jug);
		btnj1jug.setTypeface(Inicio.typeface_chelsea);
		btnj1jug.setOnClickListener(this);
		btnk1jug=(Button) findViewById(R.id.btnk1jug);
		btnk1jug.setTypeface(Inicio.typeface_chelsea);
		btnk1jug.setOnClickListener(this);
		btnl1jug=(Button) findViewById(R.id.btnl1jug);
		btnl1jug.setTypeface(Inicio.typeface_chelsea);
		btnl1jug.setOnClickListener(this);
		btnm1jug=(Button) findViewById(R.id.btnm1jug);
		btnm1jug.setTypeface(Inicio.typeface_chelsea);
		btnm1jug.setOnClickListener(this);
		btnn1jug=(Button) findViewById(R.id.btnn1jug);
		btnn1jug.setTypeface(Inicio.typeface_chelsea);
		btnn1jug.setOnClickListener(this);
		btnn21jug=(Button) findViewById(R.id.btnn21jug);
		btnn21jug.setTypeface(Inicio.typeface_chelsea);
		btnn21jug.setOnClickListener(this);
		btno1jug=(Button) findViewById(R.id.btno1jug);
		btno1jug.setTypeface(Inicio.typeface_chelsea);
		btno1jug.setOnClickListener(this);
		btnp1jug=(Button) findViewById(R.id.btnp1jug);
		btnp1jug.setTypeface(Inicio.typeface_chelsea);
		btnp1jug.setOnClickListener(this);
		btnq1jug=(Button) findViewById(R.id.btnq1jug);
		btnq1jug.setTypeface(Inicio.typeface_chelsea);
		btnq1jug.setOnClickListener(this);
		btnr1jug=(Button) findViewById(R.id.btnr1jug);
		btnr1jug.setTypeface(Inicio.typeface_chelsea);
		btnr1jug.setOnClickListener(this);
		btns1jug=(Button) findViewById(R.id.btns1jug);
		btns1jug.setTypeface(Inicio.typeface_chelsea);
		btns1jug.setOnClickListener(this);
		btnt1jug=(Button) findViewById(R.id.btnt1jug);
		btnt1jug.setTypeface(Inicio.typeface_chelsea);
		btnt1jug.setOnClickListener(this);
		btnu1jug=(Button) findViewById(R.id.btnu1jug);
		btnu1jug.setTypeface(Inicio.typeface_chelsea);
		btnu1jug.setOnClickListener(this);
		btnv1jug=(Button) findViewById(R.id.btnv1jug);
		btnv1jug.setTypeface(Inicio.typeface_chelsea);
		btnv1jug.setOnClickListener(this);
		btnw1jug=(Button) findViewById(R.id.btnw1jug);
		btnw1jug.setTypeface(Inicio.typeface_chelsea);
		btnw1jug.setOnClickListener(this);
		btnx1jug=(Button) findViewById(R.id.btnx1jug);
		btnx1jug.setTypeface(Inicio.typeface_chelsea);
		btnx1jug.setOnClickListener(this);
		btny1jug=(Button) findViewById(R.id.btny1jug);
		btny1jug.setTypeface(Inicio.typeface_chelsea);
		btny1jug.setOnClickListener(this);
		btnz1jug=(Button) findViewById(R.id.btnz1jug);
		btnz1jug.setTypeface(Inicio.typeface_chelsea);
		btnz1jug.setOnClickListener(this);

		leer();
		elegirpalabra();

		System.out.println("PA:"+palabraAadivinar);

		//ya esta la palabra al azar, que empieze el juego!
		numletras=palabraAadivinar.length();

		for(int i=0;i<numletras;i++)
			guiones1jug=guiones1jug+"_ ";

		pnlcentro1jug.setText(guiones1jug);

		int numespacios1jug=0;

		for(int i=0;i<numletras;i++){
			if(i!=0 && i!=numletras-1)
				numespacios1jug++;
		}

		txt1jug=pnlcentro1jug.getText().toString();
	}


	public void buscar1jug(char letra,Button btn){
		btn.setEnabled(false);
		txtnew1jug="";
		int cont1jug=0;
		int ayuda1jug=1;
		int arreglo1jug[]=new int[palabraAadivinar.length()];
		String txtmostrar1jug="";

		for(int i=0;i<numletras;i++){
            if(palabraAadivinar.charAt(i)==letra){
                cont1jug++;
                arreglo1jug[cont1jug]=i*2;
                if(cont1jug==1)
                	numpos1jug=i*2;

                band1jug=true;
            }
        }

		if(cont1jug==1){
			for(int j=0;j<txt1jug.length();j++)
			{
				if(j!=numpos1jug)
					txtnew1jug=txtnew1jug+txt1jug.charAt(j);
				else
					txtnew1jug=txtnew1jug+letra;
			}
			txtmostrar1jug=txtnew1jug;
			txt1jug=txtnew1jug;
			txtnew1jug="";
		}

		if(cont1jug>1){
			while(ayuda1jug<=cont1jug)
			{
				numpos1jug=arreglo1jug[ayuda1jug];

				for(int j=0;j<txt1jug.length();j++)
				{
					if(j!=numpos1jug)
						txtnew1jug=txtnew1jug+txt1jug.charAt(j);
					else
						txtnew1jug=txtnew1jug+letra;
				}
				txt1jug=txtnew1jug;
				if(ayuda1jug==cont1jug)
					txtmostrar1jug=txtnew1jug;

				txtnew1jug="";
				ayuda1jug++;
			}
			txtnew1jug="";
			cont1jug=0;
			ayuda1jug=1;
			numpos1jug=0;
			txt1jug=txtmostrar1jug;
		}

		if(numpos1jug==-1)
			txtnew1jug=guiones1jug;

		if(band1jug==false)
			txtmostrar1jug=txt1jug;

		txt1jug=txtmostrar1jug;
		pnlcentro1jug.setText(txtmostrar1jug);
		txtmostrar1jug="";


		if(band1jug==false){
			puntaje1jug=puntaje1jug-20;

			if(body1jug==0){
				cuerpo1jug.setVisibility(ImageView.VISIBLE);
				body1jug=1;
				}
			else
				if(handright1jug==0){
					manoderecha1jug.setVisibility(ImageView.VISIBLE);
					handright1jug=1;
				}
				else
					if(handleft1jug==0){
						manoizquierda1jug.setVisibility(ImageView.VISIBLE);
						handleft1jug=1;
					}
					else
						if(footright1jug==0){
							piernaderecha1jug.setVisibility(ImageView.VISIBLE);
							footright1jug=1;
						}
						else
							if(footleft1jug==0){
								piernaizquierda1jug.setVisibility(ImageView.VISIBLE);
								footleft1jug=1;
								puntaje1jug=0;
							}

		}
		else
			puntaje1jug=puntaje1jug+10;

		band1jug=false;

		String p=String.valueOf(puntaje1jug);
		puntos1jug.setText(p);

		for(int i=0;i<txt1jug.length();i++){
            if(txt1jug.charAt(i)=='_'){
                palcompleta1jug=false;
                i=txt1jug.length();
            }
            else
                if((txt1jug.charAt(i)!='_')&&(i==txt1jug.length()-1))
                    palcompleta1jug=true;
        }

		if(palcompleta1jug==true){
			soundjug1.stop();
			Intent intganar1jug=new Intent(this,Adivinaste1Jug.class);
			startActivity(intganar1jug);
			finish();
//			Toast toast = Toast.makeText(this, "GANASTE", Toast.LENGTH_SHORT);
//	        toast.show();
		}

		if(puntaje1jug==0){
			soundjug1.stop();
//			Toast toast2 = Toast.makeText(this, "PERDISTE", Toast.LENGTH_SHORT);
//	        toast2.show();
//
			Intent intperder1jug=new Intent(this,Perdiste1Jug.class);
			startActivity(intperder1jug);

			body1jug=0;
			handright1jug=0;
			handleft1jug=0;
			footright1jug=0;
			footleft1jug=0;

		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		//onActivityResult foto capturada
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==2 && RESULT_OK==resultCode){
			Bitmap thumbail=(Bitmap) data.getExtras().get("data");
			int width=thumbail.getWidth();
			int height=thumbail.getHeight();
			//int newHeight=height/2;
			//int newWidth=width/2;

			int newHeight=height;
			int newWidth=width;

			float scaleWidth=((float) newWidth)/width;
			float scaleHeight=((float) newHeight)/height;

			Matrix matrix=new Matrix();
			//matrix.postScale(scaleWidth,scaleHeight);
			matrix.postScale((float)3,(float)3);

			Bitmap resizeBitmap = Bitmap.createBitmap(thumbail,0,0,width,height,matrix,true);

			imgfoto.setImageBitmap(resizeBitmap);
		}
		else
			if(requestCode!=2 && RESULT_OK!=resultCode)
				Toast.makeText(this,"No se pudo tomar la foto :(",Toast.LENGTH_LONG).show();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.btnhome1jug:
				soundjug1.stop();
				Intent inthome=new Intent(this,Principal.class);
				startActivity(inthome);
				break;

			case R.id.btnfoto:
				Intent intfoto=new Intent("android.media.action.IMAGE_CAPTURE");
				startActivityForResult(intfoto,2);
				break;

			case R.id.btna1jug:
				buscar1jug('a', btna1jug);
				arrbtn1jug[0]=1;
				btna1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;

			case R.id.btnb1jug:
				buscar1jug('b', btnb1jug);
				arrbtn1jug[1]=1;
				btnb1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;

			case R.id.btnc1jug:
				buscar1jug('c', btnc1jug);
				arrbtn1jug[2]=1;
				btnc1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;

			case R.id.btnd1jug:
				buscar1jug('d', btnd1jug);
				arrbtn1jug[3]=1;
				btnd1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;

			case R.id.btne1jug:
				buscar1jug('e', btne1jug);
				arrbtn1jug[4]=1;
				btne1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;

			case R.id.btnf1jug:
				buscar1jug('f', btnf1jug);
				arrbtn1jug[5]=1;
				btnf1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btng1jug:
				buscar1jug('g', btng1jug);
				arrbtn1jug[6]=1;
				btng1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnh1jug:
				buscar1jug('h', btnh1jug);
				arrbtn1jug[7]=1;
				btnh1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btni1jug:
				buscar1jug('i', btni1jug);
				arrbtn1jug[8]=1;
				btni1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnj1jug:
				buscar1jug('j', btnj1jug);
				arrbtn1jug[9]=1;
				btna1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnk1jug:
				buscar1jug('k', btnk1jug);
				arrbtn1jug[10]=1;
				btnk1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnl1jug:
				buscar1jug('l', btnl1jug);
				arrbtn1jug[11]=1;
				btnl1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnm1jug:
				buscar1jug('m', btnm1jug);
				arrbtn1jug[12]=1;
				btnm1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnn1jug:
				buscar1jug('n', btnn1jug);
				arrbtn1jug[13]=1;
				btnn1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnn21jug:
				buscar1jug('�', btnn21jug);
				arrbtn1jug[14]=1;
				btnn21jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btno1jug:
				buscar1jug('o', btno1jug);
				arrbtn1jug[15]=1;
				btno1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnp1jug:
				buscar1jug('p', btnp1jug);
				arrbtn1jug[16]=1;
				btnp1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnq1jug:
				buscar1jug('q', btnq1jug);
				arrbtn1jug[17]=1;
				btnq1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnr1jug:
				buscar1jug('r', btnr1jug);
				arrbtn1jug[18]=1;
				btnr1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btns1jug:
				buscar1jug('s', btns1jug);
				arrbtn1jug[19]=1;
				btns1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnt1jug:
				buscar1jug('t', btnt1jug);
				arrbtn1jug[20]=1;
				btnt1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnu1jug:
				buscar1jug('u', btnu1jug);
				arrbtn1jug[21]=1;
				btnu1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnv1jug:
				buscar1jug('v', btnv1jug);
				arrbtn1jug[22]=1;
				btnv1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnw1jug:
				buscar1jug('w', btnw1jug);
				arrbtn1jug[23]=1;
				btnw1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnx1jug:
				buscar1jug('x', btnx1jug);
				arrbtn1jug[24]=1;
				btnx1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btny1jug:
				buscar1jug('y', btny1jug);
				arrbtn1jug[25]=1;
				btny1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnz1jug:
				buscar1jug('z', btnz1jug);
				arrbtn1jug[26]=1;
				btnz1jug.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
		}
	}
	
	public void leer(){
		try{
			FileInputStream fin=openFileInput(Categorias.catadivinar);
			InputStreamReader isr=new InputStreamReader(fin);
			
			char[] inputBuffer = new char[100];
			//Se lee el archivo de texto mientras no se llegue al final de �l
			int charRead;
			while ((charRead=isr.read(inputBuffer))>0) {
				String strRead =
					String.copyValueOf(inputBuffer, 0, charRead);
				str += strRead;

				inputBuffer = new char [100];
			}
			isr.close();

			
		}catch(IOException e){}
		
	}
	
	public void elegirpalabra(){
		int totalletras=0;
		totalletras=str.length();
		String linea="";
		
		linea=str;
		
		String s="";
		
		int r=(int)(Math.random()*totalletras-1);
		
		while(linea.charAt(r)!='-')
			r=(int)(Math.random()*totalletras-1);
		
		if(linea.charAt(r)=='-'){
			int x=r+1;
			while(linea.charAt(x)!='/')
				x++;
			
			if(linea.charAt(x)=='/'){
				int y=r+1;
				
				while(y<x){
					s=s+linea.charAt(y);
					y++;
				}
			}
			
		}
			
		palabraAadivinar=s;
		palabraPuntaje=s;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		soundjug1.stop(); 
		
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	    super.onConfigurationChanged(newConfig);
	    
	}

}
