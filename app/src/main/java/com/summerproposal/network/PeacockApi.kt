package com.summerproposal.network

import com.summerproposal.domain.model.PeacockData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface PeacockApi {

    @GET("adapter-calypso/v3/query/node/group_id/Home?represent=(segment%3Dall_free_users)(items%5Bwhere%3D(type%3DCATALOGUE%2FCOLLECTION)%5D(items%5Bwhere%3D(type%3DCATALOGUE%2FCOLLECTION%7CCATALOGUE%2FLINK%7CCATALOGUE%2FSERIES%7CCATALOGUE%2FLIVE_TILE%7CASSET%2FPROGRAMME%7CASSET%2FEPISODE%7CASSET%2FLINEAR%7CASSET%2FSHORTFORM%2FTHEATRICAL%7CASSET%2FSHORTFORM%2FTEASER%7CASSET%2FSHORTFORM%2FPROMOTION%7CASSET%2FSHORTFORM%2FCLIP%7CASSET%2FSHORTFORM%2FFEATURETTE%7CASSET%2FSHORTFORM%2FNARRATIVE%7CASSET%2FSHORTFORM%2FBLOOPER%7CASSET%2FSHORTFORM%2FPRESS%7CASSET%2FSHORTFORM%2FPRESENTATION%7CASSET%2FSLE%7CASSET%2FLINEAR_SLOT)%2Ctake%3D24%5D)%2Citems%5Bwhere%3D(type%3DCATALOGUE%2FLINK)%5D%2Citems%5Bwhere%3D(type%3DCATALOGUE%2FGROUP)%5D(items%5Bwhere%3D(type%3DCATALOGUE%2FCOLLECTION%7CCATALOGUE%2FLINK)%2Ctake%3D24%5D(items%5Bwhere%3D(type%3DCATALOGUE%2FCOLLECTION%7CCATALOGUE%2FLINK%7CCATALOGUE%2FSERIES%7CCATALOGUE%2FLIVE_TILE%7CASSET%2FPROGRAMME%7CASSET%2FEPISODE%7CASSET%2FLINEAR%7CASSET%2FSHORTFORM%2FTHEATRICAL%7CASSET%2FSHORTFORM%2FTEASER%7CASSET%2FSHORTFORM%2FPROMOTION%7CASSET%2FSHORTFORM%2FCLIP%7CASSET%2FSHORTFORM%2FFEATURETTE%7CASSET%2FSHORTFORM%2FNARRATIVE%7CASSET%2FSHORTFORM%2FBLOOPER%7CASSET%2FSHORTFORM%2FPRESS%7CASSET%2FSHORTFORM%2FPRESENTATION%7CASSET%2FSLE%7CASSET%2FLINEAR_SLOT)%5D)))")
    @Headers(
        "x-skyott-device: MOBILE",
        "x-skyott-language: en",
        "x-skyott-platform: ANDROID",
        "x-skyott-proposition: NBCUOTT",
        "x-skyott-provider: NBCU",
        "x-skyott-territory: US",
        "user-agent: PeacockAndroid-US/dirty-121020600"
    )
    suspend fun getData() : Response<PeacockData>
}