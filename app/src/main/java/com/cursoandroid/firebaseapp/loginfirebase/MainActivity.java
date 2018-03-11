package com.cursoandroid.firebaseapp.loginfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        //desloga usuário
        //firebaseAuth.signOut();

        //verifica se o usuário está logado.
        if(firebaseAuth.getCurrentUser() != null){

            Log.i("VerificaUsuario","Usuário está logado!");

        }else{
            Log.i("VerificaUsuario","Usuário não está logado!");

        }

       // login usuário
       /* firebaseAuth.signInWithEmailAndPassword("harrison230@hotmail.com","harry1234")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){//sucesso ao cadastrar

                           Log.i("signIn","Sucesso ao fazer login usuário!!");

                        }else{//erro ao cadastrar usuário

                            Log.i("signIn","Erro ao fazer login usuario!!");
                        }

                    }
                });*/


        //Cadastro
       /* firebaseAuth.createUserWithEmailAndPassword("harrison230@hotmail.com","harry1234")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        //caso o usuário tenha sido criado com sucesso.
                        if(task.isSuccessful()){//sucesso ao cadastrar

                            Log.i("createUser","Sucesso ao cadastrar usuário!!");

                        }else{//erro ao cadastrar usuário

                            Log.i("createUser","Erro ao cadastrar usuário!!");
                        }
                    }
                });*/
    }
}
