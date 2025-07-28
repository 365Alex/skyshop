package org.skypro.skyshop.article;

import org.skypro.skyshop.searchable.Searchable;

public class Article implements Searchable {

    private final String articleTitle;
    private final String textOfTheArticle;

    public Article (String articleTitle, String textOfTheArticle){
        this.articleTitle = articleTitle;
        this.textOfTheArticle = textOfTheArticle;
    }

    public String getArticleTitle(){
        return articleTitle;
    }

    public String getTextOfTheArticle(){
        return textOfTheArticle;
    }

    public String toString(){
        return "Название статьи: " + articleTitle +
                " Текст статьи: " + textOfTheArticle;
    }


    @Override
    public String searchTerm(){
        return toString();
    }

    @Override
    public String getContent(){
        return "ARTICLE";
    }

    @Override
    public String getName(){
        return articleTitle;
    }
    @Override
    public String getStringRepresentation(){
        return getName() + " " + getContent();
    }
}
