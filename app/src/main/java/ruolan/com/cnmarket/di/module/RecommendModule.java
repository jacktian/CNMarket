package ruolan.com.cnmarket.di.module;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;
import ruolan.com.cnmarket.data.AppInfoModel;
import ruolan.com.cnmarket.data.http.ApiService;
import ruolan.com.cnmarket.presenter.contract.AppInfoContract;

/**
 * Created by wuyinlei on 2017/2/22.
 */

@Module
public class RecommendModule {

    public AppInfoContract.View mView;

    public RecommendModule(AppInfoContract.View view) {
        mView = view;
    }

//    @Provides
//    public AppInfoContract.Presenter providePresenter(AppInfoContract.View view,AppInfoModel module){
//        return new RecommendPresenter(view,module);
//    }

    @Provides
    public AppInfoContract.View provideView(){
        return mView;
    }


    @Provides
    public ProgressDialog provideProgressDialog(AppInfoContract.View view){
        return new ProgressDialog(((Fragment)view).getActivity());
    }

    @Provides
    public AppInfoModel provideModel(ApiService apiService){
        return new AppInfoModel(apiService);
    }



//
//    @Provides
//    public RecommendAppAdapter provideAdapter(){
//        return null;
//    }

}
