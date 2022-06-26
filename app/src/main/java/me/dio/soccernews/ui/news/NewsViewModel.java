package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();


        //TODO Remover MOck de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque importante", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur."));
        news.add(new News("Ferrinha Joga no Sábado", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur."));
        news.add(new News("Copa do Mundo FemininaEstá Terminando", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}