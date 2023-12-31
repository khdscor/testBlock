package MyTest.test.domain.article.dao;

import MyTest.test.domain.article.domain.Article;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleMapper {

    int saveArticleList(List<Article> articles);

    List<Article> findArticlesInPage(int size, Long offset, Long memberId, String orderBy);

    @Select("select count(id) from article")
    Long countTotalArticles();
}