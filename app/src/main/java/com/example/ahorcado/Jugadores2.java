package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Jugadores2 extends Activity implements OnClickListener{

	int arrbtn[]=new int[27];
	public static MediaPlayer sound2jugs;
	TextView txtpuntos,puntos,txtjugador;
	Button btnhome;
	int numletras=0;
	TextView pnlcentro;
	int puntaje=200;
	boolean palcompleta=false;
	String guiones="";
	public static boolean bandJugar2=false;
	public static boolean mostrarpunt=false;
	ImageView cuerpo,manoderecha,piernaderecha,manoizquierda,piernaizquierda,triste,imgfoto;
	int body=0,handright=0,handleft=0,footright=0,footleft=0;
	
	String txt;
	String pal=JugsIngreso.palabra;
	int numpos=-1;
	String txtnew="";
	boolean band=false;
	
	Button btna,btnb,btnc,btnd,btne,btnf,btng,btnh,btni,btnj,btnk,btnl,btnm,btnn,btnn2,btno,btnp,btnq,btnr,btns,btnt,btnu;
	Button btnv,btnw,btnx,btny,btnz;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jugadores2);
		
		JugsIngreso.soundespera.stop();
		
		if(sound2jugs!=null)
			sound2jugs.release();
		
		sound2jugs=MediaPlayer.create(this,R.raw.gotsound);
		sound2jugs.seekTo(0);
		sound2jugs.start();
		
		cuerpo=(ImageView) findViewById(R.id.cuerpo);
		manoderecha=(ImageView) findViewById(R.id.manoderecha);
		manoizquierda=(ImageView) findViewById(R.id.manoizquierda);
		piernaderecha=(ImageView) findViewById(R.id.piernaderecha);
		piernaizquierda=(ImageView) findViewById(R.id.piernaizquierda);
		triste=(ImageView) findViewById(R.id.triste);
		imgfoto=(ImageView) findViewById(R.id.imgfoto);
		
		bandJugar2=true;
		
		pnlcentro=(TextView) findViewById(R.id.pnlcentro);
		pnlcentro.setTypeface(Inicio.typeface_chelsea);
		pnlcentro.setTextSize(30);
		
		txtpuntos=(TextView) findViewById(R.id.txtpuntos);
		txtpuntos.setTypeface(Inicio.typeface_chelsea);
		
		txtjugador=(TextView) findViewById(R.id.txtjugador);
		txtjugador.setTypeface(Inicio.typeface_chelsea);
		
		puntos=(TextView) findViewById(R.id.puntos);
		puntos.setTypeface(Inicio.typeface_chelsea);
		
		
		btnhome=(Button) findViewById(R.id.btnhome);
		btnhome.setOnClickListener(this);
		
		btna=(Button) findViewById(R.id.btna);
		btna.setTypeface(Inicio.typeface_chelsea);
		btna.setOnClickListener(this);
		btnb=(Button) findViewById(R.id.btnb);
		btnb.setTypeface(Inicio.typeface_chelsea);
		btnb.setOnClickListener(this);
		btnc=(Button) findViewById(R.id.btnc);
		btnc.setTypeface(Inicio.typeface_chelsea);
		btnc.setOnClickListener(this);
		btnd=(Button) findViewById(R.id.btnd);
		btnd.setTypeface(Inicio.typeface_chelsea);
		btnd.setOnClickListener(this);
		btne=(Button) findViewById(R.id.btne);
		btne.setTypeface(Inicio.typeface_chelsea);
		btne.setOnClickListener(this);
		btnf=(Button) findViewById(R.id.btnf);
		btnf.setTypeface(Inicio.typeface_chelsea);
		btnf.setOnClickListener(this);
		btng=(Button) findViewById(R.id.btng);
		btng.setTypeface(Inicio.typeface_chelsea);
		btng.setOnClickListener(this);
		btnh=(Button) findViewById(R.id.btnh);
		btnh.setTypeface(Inicio.typeface_chelsea);
		btnh.setOnClickListener(this);
		btni=(Button) findViewById(R.id.btni);
		btni.setTypeface(Inicio.typeface_chelsea);
		btni.setOnClickListener(this);
		btnj=(Button) findViewById(R.id.btnj);
		btnj.setTypeface(Inicio.typeface_chelsea);
		btnj.setOnClickListener(this);
		btnk=(Button) findViewById(R.id.btnk);
		btnk.setTypeface(Inicio.typeface_chelsea);
		btnk.setOnClickListener(this);
		btnl=(Button) findViewById(R.id.btnl);
		btnl.setTypeface(Inicio.typeface_chelsea);
		btnl.setOnClickListener(this);
		btnm=(Button) findViewById(R.id.btnm);
		btnm.setTypeface(Inicio.typeface_chelsea);
		btnm.setOnClickListener(this);
		btnn=(Button) findViewById(R.id.btnn);
		btnn.setTypeface(Inicio.typeface_chelsea);
		btnn.setOnClickListener(this);
		btnn2=(Button) findViewById(R.id.btnn);
		btnn2.setTypeface(Inicio.typeface_chelsea);
		btnn2.setOnClickListener(this);
		btno=(Button) findViewById(R.id.btno);
		btno.setTypeface(Inicio.typeface_chelsea);
		btno.setOnClickListener(this);
		btnp=(Button) findViewById(R.id.btnp);
		btnp.setTypeface(Inicio.typeface_chelsea);
		btnp.setOnClickListener(this);
		btnq=(Button) findViewById(R.id.btnq);
		btnq.setTypeface(Inicio.typeface_chelsea);
		btnq.setOnClickListener(this);
		btnr=(Button) findViewById(R.id.btnr);
		btnr.setTypeface(Inicio.typeface_chelsea);
		btnr.setOnClickListener(this);
		btns=(Button) findViewById(R.id.btns);
		btns.setTypeface(Inicio.typeface_chelsea);
		btns.setOnClickListener(this);
		btnt=(Button) findViewById(R.id.btnt);
		btnt.setTypeface(Inicio.typeface_chelsea);
		btnt.setOnClickListener(this);
		btnu=(Button) findViewById(R.id.btnu);
		btnu.setTypeface(Inicio.typeface_chelsea);
		btnu.setOnClickListener(this);
		btnv=(Button) findViewById(R.id.btnv);
		btnv.setTypeface(Inicio.typeface_chelsea);
		btnv.setOnClickListener(this);
		btnw=(Button) findViewById(R.id.btnw);
		btnw.setTypeface(Inicio.typeface_chelsea);
		btnw.setOnClickListener(this);
		btnx=(Button) findViewById(R.id.btnx);
		btnx.setTypeface(Inicio.typeface_chelsea);
		btnx.setOnClickListener(this);
		btny=(Button) findViewById(R.id.btny);
		btny.setTypeface(Inicio.typeface_chelsea);
		btny.setOnClickListener(this);
		btnz=(Button) findViewById(R.id.btnz);
		btnz.setTypeface(Inicio.typeface_chelsea);
		btnz.setOnClickListener(this);
		
		if(JugsIngreso.numjug==1)
			txtjugador.setText("Jugador 2");
		else
			txtjugador.setText("Jugador 1");
		
		numletras=JugsIngreso.palabra.length();
		
		
		for(int i=0;i<numletras;i++)
			guiones=guiones+"_ ";
		
		pnlcentro.setText(guiones);
		
		int numespacios=0;
		
		for(int i=0;i<numletras;i++){
			if(i!=0 && i!=numletras-1)
				numespacios++;
		}

		txt=pnlcentro.getText().toString();
		
		for(int i=0;i<27;i++)
			arrbtn[i]=0;
		
	}
	
	
	public void buscar(char letra,Button btn){
		btn.setEnabled(false);
		txtnew="";
		int cont=0;
		int ayuda=1;
		int arreglo[]=new int[JugsIngreso.palabra.length()];
		String txtmostrar="";
		
		for(int i=0;i<numletras;i++){
            if(JugsIngreso.palabra.charAt(i)==letra){
                cont++;
                arreglo[cont]=i*2;
                if(cont==1)
                	numpos=i*2;
                
                band=true;
            }
        }
		
		if(cont==1){
			for(int j=0;j<txt.length();j++)
			{
				if(j!=numpos)
					txtnew=txtnew+txt.charAt(j);
				else
					txtnew=txtnew+letra;
			}
			txtmostrar=txtnew;
			txt=txtnew;
			txtnew="";
		}
		
		if(cont>1){
			while(ayuda<=cont)
			{
				numpos=arreglo[ayuda];
            
				for(int j=0;j<txt.length();j++)
				{
					if(j!=numpos)
						txtnew=txtnew+txt.charAt(j);
					else
						txtnew=txtnew+letra;
				}
				txt=txtnew;
				if(ayuda==cont)
					txtmostrar=txtnew;
            
				txtnew="";
				ayuda++;
			}
			txtnew="";
			cont=0;
			ayuda=1;
			numpos=0;
			txt=txtmostrar;
		}
		
		if(numpos==-1)
			txtnew=guiones;
		
		if(band==false)
			txtmostrar=txt;
		
		txt=txtmostrar;
		pnlcentro.setText(txtmostrar);
		txtmostrar="";
		
		
		if(band==false){
			puntaje=puntaje-20;
			
			if(body==0){
				cuerpo.setVisibility(ImageView.VISIBLE);
				body=1;
				}
			else
				if(handright==0){
					manoderecha.setVisibility(ImageView.VISIBLE);
					handright=1;
				}
				else
					if(handleft==0){
						manoizquierda.setVisibility(ImageView.VISIBLE);
						handleft=1;
					}
					else
						if(footright==0){
							imgfoto.setVisibility(ImageView.INVISIBLE);
							triste.setVisibility(ImageView.VISIBLE);
							piernaderecha.setVisibility(ImageView.VISIBLE);
							footright=1;
						}
						else
							if(footleft==0){
								piernaizquierda.setVisibility(ImageView.VISIBLE);
								footleft=1;
								puntaje=0;
							}
			
		}
		else
			puntaje=puntaje+10;
		
		band=false;
		
		String p=String.valueOf(puntaje);
		puntos.setText(p);
		
		for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)=='_')
            {
                palcompleta=false;
                i=txt.length();
            }
            else
                if((txt.charAt(i)!='_')&&(i==txt.length()-1))
                    palcompleta=true;
        }
		
		if(palcompleta==true){
			Intent intganar=new Intent(this,Adivinaste.class);
			startActivity(intganar);
			if(JugsIngreso.numjug==1)
				JugsIngreso.puntaje1=puntaje;
			else
				JugsIngreso.puntaje2=puntaje;
			
			puntaje=200;
			finish();
		}
		
		if(puntaje==0){
			Intent intperder=new Intent(this,Perdiste.class);
			startActivity(intperder);
			
			if(JugsIngreso.numjug==1)
				JugsIngreso.puntaje1=puntaje;
			else
				JugsIngreso.puntaje2=puntaje;
			
			puntaje=200;
			body=0;
			handright=0;
			handleft=0;
			footright=0;
			footleft=0;
		}
		
		if(JugsIngreso.numjug==2)
			mostrarpunt=true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.btnhome:
				Intent inthome=new Intent(this,Principal.class);
				startActivity(inthome);
				sound2jugs.stop();
				break;
				
			case R.id.btna:
				buscar('a', btna);
				arrbtn[0]=1;
				btna.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnb:
				buscar('b', btnb);
				arrbtn[1]=1;
				btnb.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnc:
				buscar('c', btnc);
				arrbtn[2]=1;
				btnc.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnd:
				buscar('d', btnd);
				arrbtn[3]=1;
				btnd.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btne:
				buscar('e', btne);
				arrbtn[4]=1;
				btne.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnf:
				buscar('f', btnf);
				arrbtn[5]=1;
				btnf.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btng:
				buscar('g', btng);
				arrbtn[6]=1;
				btng.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnh:
				buscar('h', btnh);
				arrbtn[7]=1;
				btnh.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btni:
				buscar('i', btni);
				arrbtn[8]=1;
				btni.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnj:
				buscar('j', btnj);
				arrbtn[9]=1;
				btnj.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnk:
				buscar('k', btnk);
				arrbtn[10]=1;
				btnk.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnl:
				buscar('l', btnl);
				arrbtn[11]=1;
				btnl.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnm:
				buscar('m', btnm);
				arrbtn[12]=1;
				btnm.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnn:
				buscar('n', btnn);
				arrbtn[13]=1;
				btnn.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnn2:
				buscar('�', btnn2);
				arrbtn[14]=1;
				btnn2.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btno:
				buscar('o', btno);
				arrbtn[15]=1;
				btno.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnp:
				buscar('p', btnp);
				arrbtn[16]=1;
				btnp.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnq:
				buscar('q', btnq);
				arrbtn[17]=1;
				btnq.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnr:
				buscar('r', btnr);
				arrbtn[18]=1;
				btnr.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btns:
				buscar('s', btns);
				arrbtn[19]=1;
				btns.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnt:
				buscar('t', btnt);
				arrbtn[20]=1;
				btnt.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnu:
				buscar('u', btnu);
				arrbtn[21]=1;
				btnu.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnv:
				buscar('v', btnv);
				arrbtn[22]=1;
				btnv.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnw:
				buscar('w', btnw);
				arrbtn[23]=1;
				btnw.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnx:
				buscar('x', btnx);
				arrbtn[24]=1;
				btnx.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btny:
				buscar('y', btny);
				arrbtn[25]=1;
				btny.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
				
			case R.id.btnz:
				buscar('z', btnz);
				arrbtn[26]=1;
				btnz.setTextColor(getApplication().getResources().getColor(R.color.black));
				break;
		}
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	    super.onConfigurationChanged(newConfig);
	    
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		sound2jugs.stop();
		return super.onKeyDown(keyCode, event);
	}

	

}
