package com.example.ahorcado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import Clases.GifView;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore.Video;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Inicio extends Activity implements OnTouchListener{
	
	 MediaPlayer soundintro;
	 TextView txtintro;
	 static Typeface typeface_chelsea;
	 RelativeLayout rl_inicio;
	 
	 String palabrasCiudadesPaises="-mexico/-celaya/-berlin/-londres/"
	 		+ "-belgica/-dublin/-texas/-paris/-brasil/-guanajuato/-irlanda/"
	 		+ "-china/-dubai/-inglaterra/-rusia/-alemania/-francia/-argentina/"
	 		+ "-croacia/-ecuador";
	 
	 String palabrasComida="-hamburgesa/-papas/-tacos/-torta/-pozole/-sopa/"
	 		+ "-gelatina/-pollo/-carne/-jamon/-salchicha/-pizza/-sushi/-helado/"
	 		+ "-queso/-cereal/-huevo/-ensalada/-arroz/-galleta";
	 
	 String palabrasDeportes="-futbol/-basquetbol/-tenis/-atletismo/-hockey/"
	 		+ "-americano/-golf/-natacion/-beisbol/-ciclismo/-equitacion/-box/"
	 		+ "-handball/-esgrima/-gimmasia/-taekwondo/-voleibol/-lucha/"
	 		+ "-triatlon/-waterpolo";
	 
	 String palabrasDisney="-frozen/-princesa/-mickey/-enredados/-walt/"
	 		+ "-disneyland/-cenicienta/-blancanieves/-nemo/-elsa/-ana/"
	 		+ "-woody/-buzz/-tarzan/-pocahontas/-minnie/-aurora/-malefica/"
	 		+ "-dory/-principe";
	 
	 String palabrasMarcas="-apple/-android/-xbox/-samsung/-gap/-mattel/"
	 		+ "-levis/-kellogs/-huggies/-pepsi/-heinz/-target/-adidas/-nike/"
	 		+ "-puma/-pringles/-sabritas/-dell/-whatsapp/-nutella";
	 
	 String palabrasMusica="-yellow/-sing/-cantante/-banda/-pompeii/-bastille/"
	 		+ "-coldplay/-pop/-rock/-clasica/-concierto/-shakira/-muse/-haim/"
	 		+ "-onerepublic/-latch/-summer/-alive/-queen/-magic";
	 
	 String palabrasPeliculasSeries="-friends/-glee/-bones/-csi/-revenge/-lost/"
	 		+ "-house/-homeland/-heroes/-nashville/-dexter/-supernatural/-arrow/"
	 		+ "-malefica/-transformers/-godzilla/-divergente/-noe/-her/-xmen";
	 
	 String palabrasPersonajes="-thor/-ironman/-batman/-superman/-bumblebee/-hulk/"
	 		+ "-gatubela/-spiderman/-pinocho/-olaf/-homero/-rapunzel/-sulley/-bart/"
	 		+ "-daisy/-piolin/-goofy/-donald/-shrek/-wolverine";
	 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inicio);

		typeface_chelsea = Typeface.createFromAsset(getAssets(),  "fonts/ChelseaMarket-Regular.ttf");

		rl_inicio = (RelativeLayout) findViewById(R.id.rl_inicio);
		rl_inicio.setOnTouchListener(this);
		
		if(soundintro!=null)
			soundintro.release();
		
		soundintro=MediaPlayer.create(this,R.raw.holdon);
		soundintro.seekTo(0);
		soundintro.start();
		
		boolean b=existsFile("comida.txt");
		if(b==false)
			escribir("comida.txt",palabrasComida);
		
		boolean b2=existsFile("personajes.txt");
		if(b==false)
			escribir("personajes.txt",palabrasPersonajes);
		
		boolean b3=existsFile("ciudadespaises.txt");
		if(b==false)
			escribir("ciudadespaises.txt",palabrasCiudadesPaises);
		
		boolean b4=existsFile("musica.txt");
		if(b==false)
			escribir("musica.txt",palabrasMusica);
		
		boolean b5=existsFile("peliculasseries.txt");
		if(b==false)
			escribir("peliculasseries.txt",palabrasPeliculasSeries);
		
		boolean b6=existsFile("marcas.txt");
		if(b==false)
			escribir("marcas.txt",palabrasMarcas);
		
		boolean b7=existsFile("deportes.txt");
		if(b==false)
			escribir("deportes.txt",palabrasDeportes);
		
		boolean b8=existsFile("disney.txt");
		if(b==false)
			escribir("disney.txt",palabrasDisney);


		txtintro = (TextView) findViewById(R.id.txtintro);
		txtintro.setTypeface(typeface_chelsea);
		animate();
	}
	

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		Intent inthome=new Intent(this,Principal.class);
		startActivity(inthome);
		soundintro.stop();
		
		return false;
	}
	
	public boolean existsFile(String fileName) {
	    for (String tmp : fileList()) {
	        if (tmp.equals(fileName))
	            return true;
	    }
	    return false;
	}
	
	public void escribir(String categoria,String palabra){
		
		FileOutputStream fout=null;
		try{
			fout=openFileOutput(categoria,MODE_APPEND);
			OutputStreamWriter ows=new OutputStreamWriter(fout);
			ows.write(palabra);
			ows.flush();
			ows.close();
			
		}catch(IOException e){}
		
	}

	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	    super.onConfigurationChanged(newConfig);

	    if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
	        Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
	    } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
	        Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
	    }
	    
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		soundintro.stop(); 
		
		return super.onKeyDown(keyCode, event);
	}

	//fade in del logotipo
	private void animate() {
		TextView textView = (TextView) findViewById(R.id.txtintro);
		Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
		textView.startAnimation(myFadeInAnimation);
	}

}
