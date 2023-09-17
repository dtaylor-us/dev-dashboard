import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RepoListComponent} from './repo-list/repo-list.component';
import {RepoDetailComponent} from './repo-detail/repo-detail.component';
import {HttpClientModule} from '@angular/common/http';
import {GithubService} from "./github.service";
import {FormsModule} from "@angular/forms";
import {MatInputModule} from "@angular/material/input";
import {MatButtonModule} from "@angular/material/button";
import {GithubRoutingModule} from "./github-routing.module";


@NgModule({
  declarations: [
    RepoListComponent,
    RepoDetailComponent
  ],
  exports: [RepoListComponent],
  providers: [GithubService],
  imports: [
    CommonModule,
    HttpClientModule,
    FormsModule,
    GithubRoutingModule,
    MatInputModule,
    MatButtonModule
  ]
})
export class GithubModule { }
