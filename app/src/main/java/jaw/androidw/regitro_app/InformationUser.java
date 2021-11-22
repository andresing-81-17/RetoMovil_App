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

public class InformationUser extends Fragment {
    List<ListElement> elements;
    View view;
    ListAdapter listAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        init();
        view = inflater.inflate(R.layout.information_user,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.autoresRecycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(listAdapter);

        return view;
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447","Erika Peña","Soy Ingeniera de Sistemas haciendo con mestria en ingeniria de sistemas del politecnico GranColombiano"));
        elements.add(new ListElement("#607d8d","Jairo Wilches","Soy Ingeniero de Sistemas con enfasis en programación hacien la maestria en el politecnico Grancolombiano"));

        listAdapter = new ListAdapter(elements,getActivity());


    }
}
