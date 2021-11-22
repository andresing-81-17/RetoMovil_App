package jaw.androidw.regitro_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListUserCreate extends Fragment {
    List<ListElement> elements;
    View view;
    ListAdapter listAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        init();
        view = inflater.inflate(R.layout.list_user,container, false);
        RecyclerView recyclerView = view.findViewById(R.id.listRecycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(listAdapter);

        return view;
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447","Carlos","Es una persona muy seria"));
        elements.add(new ListElement("#607d8d","Martha","Me gusta mucho Bailar salsa"));
        elements.add(new ListElement("#03a9f4","Julio","Siempre me gusta programar"));
        elements.add(new ListElement("#f44336","Pedro","Estoy muy feliz de conocerlo"));
        elements.add(new ListElement("#009688","Sandra","Mi descripción es corta pero muy concreta"));
        elements.add(new ListElement("#006528","Margarita","Hola a todos"));

        listAdapter = new ListAdapter(elements,getActivity());


    }
}
